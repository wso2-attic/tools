package org.wso2.maven.closure;

/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.javascript.jscomp.*;
import com.google.javascript.jscomp.Compiler;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @goal compile
 * @phase generate-sources
 */
public class ClosureCompilerMojo extends AbstractMojo {

    private static final String JS_SUFFIX = ".js";
    private static final String BASE_FILE_NAME = "base" + JS_SUFFIX;
    private static final String FOR_NAME_METHOD_NAME = "forName";

    /**
     * one of "WHITESPACE_ONLY", "SIMPLE_OPTIMIZATIONS", "ADVANCED_OPTIMIZATIONS".
     * see the <a href="http://code.google.com/closure/compiler/docs/compilation_levels.html">definitions</a>
     * for each level.
     *
     * @parameter
     * @required
     */
    private String compilationLevel;

    /**
     * one of "DEFAULT", "VERBOSE", "QUIET"
     *
     * @parameter default-value="DEFAULT"
     */
    private String warningLevel;

    /**
     * list of files (and directories) to be used as externs.
     * see <a href="http://code.google.com/closure/compiler/docs/api-tutorial3.html#externs">documentation</a>
     *
     * @parameter
     */
    private File[] externs;

    /**
     * array of warning to be promoted as errors.
     *
     * @parameter
     * @see com.google.javascript.jscomp.DiagnosticGroups#DIAGNOSTIC_GROUP_NAMES
     */
    private String[] errors;

    /**
     * let the compiler re-arrange the source file order.
     * 'true' by default
     *
     * @parameter default-value="true"
     */
    private boolean manageDependencies;

    /**
     * this will turn on both debug flag and the PRETTY_PRINT formatting.
     *
     * @parameter default-value="false" expression="${js.debug}"
     */
    private boolean debug;

    /**
     * @parameter
     */
    private CompilableUnit[] compileUnits;


    public void execute() throws MojoExecutionException, MojoFailureException {
        List<JSSourceFile> externFiles = toSourceFiles(externs);

        for (CompilableUnit unit : compileUnits) {
            executeUnit(unit,externFiles);
        }
    }

    public void executeUnit(CompilableUnit unit, List<JSSourceFile> externFiles) throws MojoExecutionException, MojoFailureException {
        File[] inputs = unit.getInputs();
        File output = unit.getOutput();
        Compiler compiler = new Compiler();
        CompilerOptions compilerOptions = populateCompilerOptions(unit.getDefinitions());

        Result result = compiler.compile(
                externFiles,
                toSourceFiles(inputs),
                compilerOptions
        );

        for (JSError warning : result.warnings) {
            getLog().warn(warning.toString());
        }

        for (JSError error : result.errors) {
            getLog().error(error.toString());
        }

        if (!result.success) {
            throw new MojoFailureException("Compilation failure");
        }

        try {
            Files.createParentDirs(output);
            Files.touch(output);
            Files.write(compiler.toSource(), output, Charsets.UTF_8);
        } catch (IOException e) {
            throw new MojoFailureException(output != null ? output.toString() : e.getMessage(), e);
        }
    }

    private CompilerOptions populateCompilerOptions(Definition[] definitions) throws MojoFailureException {
        CompilerOptions compilerOptions = new CompilerOptions();

        //almost always needed, thus hard-coded.
        compilerOptions.closurePass = true;

        WarningLevel warningLevel;
        try {
            warningLevel = WarningLevel.valueOf(this.warningLevel);
        } catch (IllegalArgumentException e) {
            throw new MojoFailureException("Unknown warning level", e);
        }
        warningLevel.setOptionsForWarningLevel(compilerOptions);


        CompilationLevel compilationLevel;
        try {
            compilationLevel = CompilationLevel.valueOf(this.compilationLevel);
        } catch (IllegalArgumentException e) {
            throw new MojoFailureException("Unknown compilation level", e);
        }

        compilationLevel.setOptionsForCompilationLevel(compilerOptions);
        if (debug) {
            compilationLevel.setDebugOptionsForCompilationLevel(compilerOptions);
            compilerOptions.prettyPrint = true;
        } else {
            compilerOptions.setDefineToBooleanLiteral("goog.DEBUG", false);
        }

        if(definitions!=null){
            for (Definition definition : definitions) {
                DefinitionType type = null;
                try {
                    type = DefinitionType.valueOf(definition.getType());
                } catch (Exception e) {
                    throw new MojoFailureException("Unknown definition type", e);
                }
                switch (type){
                    case BOOLEAN:
                        compilerOptions.setDefineToBooleanLiteral(definition.getName(),
                                Boolean.parseBoolean(definition.getValue()));
                        break;
                    case STRING:
                        compilerOptions.setDefineToStringLiteral(definition.getName(),
                                definition.getValue());
                        break;
                    case DOUBLE:
                        compilerOptions.setDefineToDoubleLiteral(definition.getName(),
                                Double.parseDouble(definition.getValue()));
                        break;
                    default:
                }
            }
        }

        compilerOptions.setManageClosureDependencies(manageDependencies);

        //HACK: DiagnosticGroups class is not an Enum (why?) and has private methods, so reflected.
        Method forName = null;
        try {
            forName = DiagnosticGroups.class.getDeclaredMethod(FOR_NAME_METHOD_NAME, String.class);
            forName.setAccessible(true);
        } catch (NoSuchMethodException e) {
            //ignore, this should never happen
        }
        DiagnosticGroups diagnosticGroups = new DiagnosticGroups();

        if (errors != null) {
            for (String error : errors) {
                try {
                    DiagnosticGroup group = (DiagnosticGroup) forName.invoke(diagnosticGroups, error);
                    if (group == null) {
                        throw new MojoFailureException("Unknown diagnostic group " + error);
                    }
                    compilerOptions.setWarningLevel(group, CheckLevel.ERROR);
                } catch (IllegalAccessException e) {
                    //ignore, this should never happen
                } catch (InvocationTargetException e) {
                    //ignore, this should never happen
                }
            }
        }


        return compilerOptions;
    }

    /**
     * convert array of Files to list of JSSourceFiles while expanding
     * directories (if any).
     *
     * @param files Array of file to be converted
     * @return Converted JSSourceFiles
     */
    private List<JSSourceFile> toSourceFiles(File[] files) {
        ArrayList<JSSourceFile> sourceFiles = new ArrayList<JSSourceFile>();
        if (files != null) {
            for (File file : files) {
                addFiles(sourceFiles, file);
            }
        }
        return sourceFiles;
    }

    /**
     * convert the File to JSSourceFile and add to the list.
     * if the File is a directory then, recursively add all the JS files in the
     * directory and it's sub directories to the jsSourceFiles list
     *
     * @param jsSourceFiles A List to which the JSSourceFile to be added
     * @param file          Directory to be searched.
     */
    private void addFiles(List<JSSourceFile> jsSourceFiles, File file) {
        if (file != null) {
            if (file.isFile()) {
                String name = file.getName();
                if (name.endsWith(JS_SUFFIX)) {
                    JSSourceFile sourceFile = JSSourceFile.fromFile(file);

                    /* HACK: base.js is a dependency for every other js file.
                    * but it's not explicitly mentioned in each file.
                    * so compiler seems to be incapable of ordering it correctly.
                    * as a work-around, base.js file is moved to top of the
                    * input list.
                    */
                    if (name.equalsIgnoreCase(BASE_FILE_NAME)) {
                        jsSourceFiles.add(0, sourceFile);
                    } else {
                        jsSourceFiles.add(sourceFile);
                    }
                }
            } else {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File child : files) {
                        addFiles(jsSourceFiles, child);
                    }
                }
            }
        }
    }

}

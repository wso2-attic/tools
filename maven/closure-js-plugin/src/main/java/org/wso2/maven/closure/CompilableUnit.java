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
import java.io.File;

public class CompilableUnit {

    /**
     * list of files (and directories) to be used as inputs.
     *
     * @parameter
     * @required
     */
    private File[] inputs;

    /**
     * path to write the compiled JavaScript.
     *
     * @parameter
     * @required
     */
    private File output;

    /**
     * constant to be overridden at the compile time.
     *
     * @required
     * @parameter
     */
    private Definition[] definitions;


    public File[] getInputs() {
        return inputs;
    }

    public File getOutput() {
        return output;
    }

    public Definition[] getDefinitions() {
        return definitions;
    }
}

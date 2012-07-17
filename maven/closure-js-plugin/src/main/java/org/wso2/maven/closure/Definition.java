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

public class Definition {

    /**
     * name of the '@define'
     * eg:-  goog.DEBUG
     *
     * @required
     * @parameter
     */
    private String name;

    /**
     * literal to replace the define.
     * if the type is BOOLEAN or DOUBLE the value should be literal of the
     * corresponding type.
     *
     * @required
     * @parameter
     */
    private String value;

    /**
     * should be one of "STRING", "BOOLEAN", "DOUBLE"
     *
     * @required
     * @parameter
     */
    private String type;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }


    public String getType() {
        return type;
    }
}

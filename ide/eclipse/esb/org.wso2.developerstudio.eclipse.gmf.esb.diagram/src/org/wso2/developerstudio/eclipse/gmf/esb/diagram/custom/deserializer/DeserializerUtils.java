/*
 * Copyright 2009-2010 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class DeserializerUtils {

	public static boolean isInteger(String numberString) {

		try {
			Integer.parseInt(numberString);
		} catch (NumberFormatException e) {

			return false;
		}

		return true;
	}

	public static boolean isValidRegex(String regex) {

		try {
			Pattern.compile(regex);
		} catch (PatternSyntaxException exception) {

			return false;
		}

		return true;
	}
	
	protected static String join(Iterable<? extends CharSequence> s, String delimiter) {
	    @SuppressWarnings("unchecked")
		Iterator<String> iter = (Iterator<String>) s.iterator();
	    StringBuffer buffer = new StringBuffer(iter.next());
	    while (iter.hasNext()) buffer.append(delimiter).append(iter.next());
	    return buffer.toString();
	}

}

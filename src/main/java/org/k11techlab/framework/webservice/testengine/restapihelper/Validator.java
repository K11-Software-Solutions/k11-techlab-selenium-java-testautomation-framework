/******************************************************************************
 * Copyright 2025, K11 Software Solutions. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author: Kavita Jadhav (kavita.jadhav.sdet@gmail.com)
 ******************************************************************************/

package org.k11techlab.framework.webservice.testengine.restapihelper;

public class Validator {


    public static void validateStatusCode(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected status code " + expected + " but got " + actual);
        }
    }


    public static void validateResponseBodyContains(String expectedContent, String actualBody) {
        if (!actualBody.contains(expectedContent)) {
            throw new AssertionError("Expected body to contain: " + expectedContent);
        }
    }
}

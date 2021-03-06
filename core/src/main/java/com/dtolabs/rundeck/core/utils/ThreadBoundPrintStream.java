/*
 * Copyright 2016 SimplifyOps, Inc. (http://simplifyops.com)
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
 */

/*
* ThreadBoundPrintStream.java
* 
* User: Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
* Created: Sep 9, 2010 11:49:54 AM
* $Id$
*/
package com.dtolabs.rundeck.core.utils;

import java.io.PrintStream;

/**
 * ThreadBoundPrintStream wraps a ThreadBoundOutputStream and provides accessor for the OutputStream.
 *
 * @author Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
 * @version $Revision$
 */
public class ThreadBoundPrintStream extends PrintStream {
    private final ThreadBoundOutputStream threadBoundOutputStream;

    public ThreadBoundPrintStream(final ThreadBoundOutputStream threadBoundOutputStream) {
        super(threadBoundOutputStream);
        this.threadBoundOutputStream = threadBoundOutputStream;
    }

    public ThreadBoundOutputStream getThreadBoundOutputStream() {
        return threadBoundOutputStream;
    }
}

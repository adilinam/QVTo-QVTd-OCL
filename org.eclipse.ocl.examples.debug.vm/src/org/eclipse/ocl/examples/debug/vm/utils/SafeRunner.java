/*******************************************************************************
 * Copyright (c) 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     R.Dvorak and others - QVTo debugger framework
 *     E.D.Willink - revised API for OCL debugger framework
 *******************************************************************************/
package org.eclipse.ocl.examples.debug.vm.utils;


public class SafeRunner {
    public static interface IRunner {
        public void run(BaseProcess.IRunnable r) throws Exception;
    }
    
    public static BaseProcess.IRunnable getSafeRunnable(final BaseProcess.IRunnable r) {
        final IRunner runner = SameThreadRunner.INSTANCE;
        return new BaseProcess.IRunnable() {
            public void run() throws Exception {
                runner.run(r);
            }
        };
    }

    static class SameThreadRunner implements IRunner {
        public void run(BaseProcess.IRunnable r) throws Exception {
            r.run();
        }
        
        static IRunner INSTANCE = new SameThreadRunner();
    }
}
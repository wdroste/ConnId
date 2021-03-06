/**
 * ====================
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2008-2009 Sun Microsystems, Inc. All rights reserved.
 * Copyright 2011-2013 Tirasa. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License("CDDL") (the "License"). You may not use this file
 * except in compliance with the License.
 *
 * You can obtain a copy of the License at https://oss.oracle.com/licenses/CDDL
 * See the License for the specific language governing permissions and limitations
 * under the License.
 *
 * When distributing the Covered Code, include this CDDL Header Notice in each file
 * and include the License file at https://oss.oracle.com/licenses/CDDL.
 * If applicable, add the following below this CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * ====================
 */
package org.identityconnectors.framework.impl.api.remote.messages;

/**
 * Represents one part of a response. Most operations return
 * just a single response part, followed by a OperationResponseEnd.
 * The one exception is Search, which returns multiple parts.
 */
public class OperationResponsePart implements Message {
    private Throwable _exception;
    private Object _result;
    
    public OperationResponsePart(Throwable ex, Object result) {
        _exception = ex;
        _result = result;
    }
    
    public Throwable getException() {
        return _exception;
    }
    
    public Object getResult() {
        return _result;
    }
}

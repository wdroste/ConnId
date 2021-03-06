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
package org.identityconnectors.framework.common.objects.filter;

import org.identityconnectors.framework.common.objects.ConnectorObject;

public final class OrFilter extends CompositeFilter {
    /**
     * Takes the result of the left and right filter and ORs them.
     */
    public OrFilter(Filter left, Filter right) {
        super(left, right);
    }

    /**
     * Takes the result from the left and ORs it w/ the right filter.
     * @see Filter#accept(ConnectorObject)
     */
    public boolean accept(ConnectorObject obj) {
        return this.getLeft().accept(obj) || this.getRight().accept(obj);
    }

    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        bld.append("OR: ").append(getLeft()).append(", ").append(getRight());
        return bld.toString();
    }
}

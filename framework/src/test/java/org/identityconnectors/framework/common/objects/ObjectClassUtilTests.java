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
package org.identityconnectors.framework.common.objects;

import static org.identityconnectors.framework.common.objects.ObjectClassUtil.isSpecial;
import static org.identityconnectors.framework.common.objects.ObjectClassUtil.namesEqual;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ObjectClassUtilTests {

    @Test
    public void testIsSpecial() {
        assertTrue(isSpecial(ObjectClass.ACCOUNT));
        assertFalse(isSpecial(new ObjectClass("o")));
    }

    @Test
    public void testNamesEqual() {
        assertTrue(namesEqual("ACCOUNT", "account"));
    }
}

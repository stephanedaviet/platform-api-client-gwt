/*******************************************************************************
 * Copyright (c) 2012-2014 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.ide.dto.definitions;

import com.codenvy.dto.shared.DTO;

/**
 * DTO for testing that the {@link com.codenvy.dto.generator.DtoGenerator}
 * correctly generates server implementations for simple DTO interface.
 *
 * @author <a href="mailto:azatsarynnyy@codenvy.com">Artem Zatsarynnyy</a>
 */
@DTO
public interface SimpleDto {
    int getId();

    SimpleDto withId(int id);

    String getName();

    SimpleDto withName(String name);
}

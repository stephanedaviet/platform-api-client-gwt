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
package com.codenvy.ide.rest;

import com.codenvy.ide.dto.DtoFactory;
import com.google.gwt.http.client.Response;
import com.google.gwt.json.client.JSONParser;

/**
 * Deserializer for responses body.
 *
 * @author Artem Zatsarynnyy
 */
public class DtoUnmarshaller<T> implements Unmarshallable<T> {
    protected T          payload;
    private   Class<?>   dtoInterface;
    private   DtoFactory dtoFactory;

    /**
     * Create new {@link DtoUnmarshaller} to deserialize response
     * to the DTO of type specified by {@code dtoInterface}.
     *
     * @param dtoInterface
     */
    public DtoUnmarshaller(Class<?> dtoInterface, DtoFactory dtoFactory) {
        this.dtoInterface = dtoInterface;
        this.dtoFactory = dtoFactory;
    }

    /** {@inheritDoc} */
    @Override
    public void unmarshal(Response response) {
        if (isJsonArray(response)) {
            payload = (T)dtoFactory.createListDtoFromJson(response.getText(), dtoInterface);
        } else {
            payload = (T)dtoFactory.createDtoFromJson(response.getText(), dtoInterface);
        }
    }

    /** {@inheritDoc} */
    @Override
    public T getPayload() {
        return payload;
    }

    private boolean isJsonArray(Response response) {
        return JSONParser.parseStrict(response.getText()).isArray() != null;
    }
}

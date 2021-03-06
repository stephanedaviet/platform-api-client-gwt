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
package com.codenvy.ide.websocket.events;

/**
 * Event is fired, when WebSocket message was received.
 *
 * @author <a href="mailto:azatsarynnyy@exoplatform.org">Artem Zatsarynnyy</a>
 * @version $Id: MessageReceivedEvent.java Jun 18, 2012 14:33:50 PM azatsarynnyy $
 */
public class MessageReceivedEvent {
    /** Received message. */
    private String message;

    public MessageReceivedEvent(String message) {
        this.message = message;
    }

    /**
     * Returns message.
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }

}

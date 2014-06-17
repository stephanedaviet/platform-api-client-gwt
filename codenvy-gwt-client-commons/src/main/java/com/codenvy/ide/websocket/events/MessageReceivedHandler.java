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
 * Handler for {@link MessageReceivedEvent} event.
 *
 * @author <a href="mailto:azatsarynnyy@exoplatform.org">Artem Zatsarynnyy</a>
 * @version $Id: MessageReceivedHandler.java Jun 18, 2012 14:44:55 PM azatsarynnyy $
 */
public interface MessageReceivedHandler {
    /**
     * Perform actions, when a WebSocket message was received.
     *
     * @param event
     *         {@link MessageReceivedEvent}
     */
    void onMessageReceived(MessageReceivedEvent event);
}

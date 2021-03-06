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
package com.codenvy.ide.commons.exception;

import com.google.gwt.event.shared.EventHandler;

/** @author <a href="mailto:gavrikvetal@gmail.com">Vitaliy Gulyy</a> */

public interface ExceptionThrownHandler extends EventHandler {

    void onError(ExceptionThrownEvent event);

}

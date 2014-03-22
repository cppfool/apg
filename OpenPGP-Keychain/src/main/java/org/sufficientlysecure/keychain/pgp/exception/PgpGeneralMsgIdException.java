/*
 * Copyright (C) 2012-2013 Dominik Schürmann <dominik@dominikschuermann.de>
 * Copyright (C) 2010 Thialfihar <thi@thialfihar.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.thialfihar.android.apg.pgp.exception;

import android.content.Context;

public class PgpGeneralMsgIdException extends Exception {
    static final long serialVersionUID = 0xf812773343L;

    private final int msgId;

    public PgpGeneralMsgIdException(int msgId) {
        super("msg[" + msgId + "]");
        this.msgId = msgId;
    }

    public PgpGeneralException getContextualized(Context context) {
        return new PgpGeneralException(context.getString(msgId), this);
    }
}

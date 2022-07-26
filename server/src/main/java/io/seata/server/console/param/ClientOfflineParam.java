/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.server.console.param;

import io.seata.console.param.BaseParam;

import java.io.Serializable;

/**
 * @author TheR1sing3un
 * @date 2022/7/26 22:03
 * @description the param which be used to offline client
 */

public class ClientOfflineParam extends BaseParam implements Serializable {
    private static final long serialVersionUID = 195593845420020908L;

    // app:ip:port
    private String clientId;

    // resourceId, for Rm
    private String resourceId;

    // TMROLE/RMROLE
    private String clientRole;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getClientRole() {
        return clientRole;
    }

    public void setClientRole(String clientRole) {
        this.clientRole = clientRole;
    }
}

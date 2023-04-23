package com.acme.statusmgr.beans.decoratorDetails;


import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.SystemStatuses.SystemStatusInterface;
import com.acme.statusmgr.beans.SystemStatuses.mockSystemStatus;
import com.acme.statusmgr.beans.SystemStatuses.realSystemStatus;

/**
 * This abstract class allows for easy creation of multiple decorators
 * of the type ServerInterface which StatusServer is also of that type
 *
 */
public abstract class BaseDecorator implements ServerInterface {
    ServerInterface ss;
    static SystemStatusInterface sSI = new realSystemStatus();


    public static void setSystemInfoFacade(SystemStatusInterface ssi) {
        sSI = ssi;
    }

    public BaseDecorator(ServerInterface ss){this.ss = ss;}


}

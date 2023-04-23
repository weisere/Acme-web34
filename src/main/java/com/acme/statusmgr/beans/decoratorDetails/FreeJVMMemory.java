package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerInterface;
/**
 *Decorator on top of ServerStatus that allows
 *user to also get JVM memory available on server
 */

public class FreeJVMMemory extends BaseDecorator{
    final int requestCost = 7;

    public FreeJVMMemory(ServerInterface ss) {
        super(ss);
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getContentHeader() {
        return ss.getContentHeader();
    }

    @Override
    public String getStatusDesc(){
        return ss.getStatusDesc() + ", and there are " + sSI.getFreeJVMMemory() + " bytes of JVM memory free";
    }

    @Override
    public Integer getRequestCost(){
        return ss.getRequestCost() + requestCost;
    }
}

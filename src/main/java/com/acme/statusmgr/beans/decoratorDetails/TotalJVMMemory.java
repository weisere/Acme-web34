package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerInterface;
/**
 *Decorator on top of ServerStatus that allows
 *user to also get total  available memory on server
 *
 */
public class TotalJVMMemory extends BaseDecorator{
    final int requestCost = 13;

    public TotalJVMMemory(ServerInterface ss) {
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
        return ss.getStatusDesc() + ", and there is a total of "+ sSI.getTotalJVMMemory() +" bytes of JVM memory";
    }

    @Override
    public Integer getRequestCost(){
        return ss.getRequestCost() + requestCost;
    }
}

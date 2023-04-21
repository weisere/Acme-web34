package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerInterface;
/**
 *Decorator on top of ServerStatus that allows
 *user to also get temporary location on server
 */
public class TempLocation extends BaseDecorator{
    final int requestCost = 29;

    public TempLocation(ServerInterface ss) {
        super(ss);
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getContentHeader() {
        return null;
    }

    @Override
    public String getStatusDesc(){
        return ss.getStatusDesc() + ", and the server's temp file location is " + System.getenv("TEMP");
    }

    @Override
    public Integer getRequestCost(){
        return ss.getRequestCost() + requestCost;
    }
}

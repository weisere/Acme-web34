package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerInterface;


/**
 *Decorator on top of ServerStatus that allows
 *user to also get available  processors on server
 */
public class AvailableProcessors extends BaseDecorator{
    final int requestCost = 3;

    public AvailableProcessors(ServerInterface ss) {
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
        return ss.getStatusDesc() + ", and there are " + Runtime.getRuntime().availableProcessors() + " processors available";
    }

    @Override
    public Integer getRequestCost(){
        return ss.getRequestCost() + requestCost;
    }
}

package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerInterface;
/**
 *Decorator on top of ServerStatus that allows
 *user to also get Jre version on server
 */
public class JreVersion extends BaseDecorator {
    final int requestCost = 19;
    public JreVersion(ServerInterface ss) {
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
        return ss.getStatusDesc() + ", and the JRE version is " + sSI.getJreVersion();
    }

    @Override
    public Integer getRequestCost(){
        return ss.getRequestCost() + requestCost;
    }
}

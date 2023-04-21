package com.acme.statusmgr.beans.decoratorDetails;

import com.acme.statusmgr.beans.ServerInterface;
/**
 * This abstract class allows for easy creation of multiple decorators
 * of the type ServerInterface which StatusServer is also of that type
 */
public abstract class BaseDecorator implements ServerInterface {
    ServerInterface ss;

    public BaseDecorator(ServerInterface ss){this.ss = ss;}


}

package com.lzy.j2ee.server.publicinterface.remote;

import javax.ejb.Remote;

/**
 * Created by lzy on 2017/8/19.
 */
@Remote
public interface IStatelessSessionWebServiceRemote {

    public String sayHello(String name);
}

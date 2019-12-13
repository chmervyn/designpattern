package com.sap.mervyn.designpattern.proxy.forceproxy;

public interface IGamePlayer {

    void login(String userName, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();

}

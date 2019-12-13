package com.sap.mervyn.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("mervyn");
        InvocationHandler handler = new GamePlayerIH(player);

        System.out.println("start time is: 2009-08-25 10:45");

        ClassLoader loader = player.getClass().getClassLoader();
        Class[] interfaces = player.getClass().getInterfaces();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, interfaces, handler);

        proxy.login("Chmervyn", "Abc123");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("end time is: 2009-08-26 01:34");
    }
}

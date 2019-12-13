package com.sap.mervyn.designpattern.proxy.normalproxy;

public class Client {

    public static void main(String[] args) {

        IGamePlayer proxy = new GamePlayerProxy("mervyn");

        System.out.println("start time is: 2009-08-25 10:45");
        proxy.login("Chmervyn", "Abc123");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("end time is: 2009-08-26 01:34");

    }

}

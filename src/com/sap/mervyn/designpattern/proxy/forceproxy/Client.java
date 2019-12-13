package com.sap.mervyn.designpattern.proxy.forceproxy;

public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("mervyn");

        System.out.println("start time is: 2009-08-25 10:45");
        player.login("Chmervyn", "Abc123");
        player.killBoss();
        player.upgrade();
        System.out.println("end time is: 2009-08-26 01:34");

        System.out.println("##############################");

        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("start time is: 2009-08-25 10:45");
        proxy.login("Chmervyn", "Abc123");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("end time is: 2009-08-26 01:34");

        System.out.println("##############################");

        proxy = player.getProxy();
        System.out.println("start time is: 2009-08-25 10:45");
        proxy.login("Chmervyn", "Abc123");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("end time is: 2009-08-26 01:34");

    }

}

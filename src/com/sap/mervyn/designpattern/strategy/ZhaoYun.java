package com.sap.mervyn.designpattern.strategy;

public class ZhaoYun {

    public static void main(String[] args) {
        Context ctx;

        System.out.println("---刚刚到吴国的时候拆第一个---");
        ctx = new Context(new BackDoor());
        ctx.operate();
        System.out.println("\n\n\n");

        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        ctx = new Context(new GivenGreenLight());
        ctx.operate();
        System.out.println("\n\n\n");

        System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
        ctx = new Context(new BlockEnemy());
        ctx.operate();



    }

}

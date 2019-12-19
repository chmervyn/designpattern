package com.sap.mervyn.designpattern.strategy.general;

public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context ctx = new Context(strategy);
        ctx.doAnything();

        strategy = new ConcreteStrategy2();
        ctx = new Context(strategy);
        ctx.doAnything();
    }

}

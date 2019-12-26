package com.sap.mervyn.designpattern.bridge.general;

public class Client {

    public static void main(String[] args) {
        Implementor impl = new ConcreteImplementor1();
        Abstraction abs = new RefinedAbstraction(impl);

        abs.request();
    }

}

package com.sap.mervyn.designpattern.adapter.general;

public class Client {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        target = new Adapter();
        target.request();
    }

}

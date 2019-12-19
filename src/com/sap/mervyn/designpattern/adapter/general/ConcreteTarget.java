package com.sap.mervyn.designpattern.adapter.general;

public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("if you need any help, please call me!");
    }
}

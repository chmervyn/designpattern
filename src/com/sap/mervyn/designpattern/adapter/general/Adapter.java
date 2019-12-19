package com.sap.mervyn.designpattern.adapter.general;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.doSomething();
    }
}

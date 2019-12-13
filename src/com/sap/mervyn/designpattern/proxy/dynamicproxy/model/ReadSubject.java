package com.sap.mervyn.designpattern.proxy.dynamicproxy.model;

public class ReadSubject implements Subject {

    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}

package com.sap.mervyn.designpattern.templatemethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass1 doSomething...");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass1 doAnything...");
    }
}

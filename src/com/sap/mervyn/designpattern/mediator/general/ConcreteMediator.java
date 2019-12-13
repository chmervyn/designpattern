package com.sap.mervyn.designpattern.mediator.general;

public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        c1.selfMethod1();
        c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        c1.depentMethod1();
        c2.depentMethod2();
    }
}

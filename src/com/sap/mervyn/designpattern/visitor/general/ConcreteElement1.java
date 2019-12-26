package com.sap.mervyn.designpattern.visitor.general;

public class ConcreteElement1 extends Element {

    @Override
    public void doSomething() {

    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}

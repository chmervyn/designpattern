package com.sap.mervyn.designpattern.visitor.general;

public abstract class Element {

    public abstract void doSomething();

    public abstract void accept(IVisitor visitor);

}

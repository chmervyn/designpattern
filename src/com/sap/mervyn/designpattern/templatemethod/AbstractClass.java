package com.sap.mervyn.designpattern.templatemethod;

public abstract class AbstractClass {

    protected abstract void doSomething();

    protected abstract void doAnything();

    public final void templateMethod() {
        System.out.println("#####################");
        this.doSomething();

        if (isDoAnything()) this.doAnything();
    }

    /*
    default value is true, subtype can overwrite it to change return value
     */
    protected boolean isDoAnything() {
        return false;
    }

}

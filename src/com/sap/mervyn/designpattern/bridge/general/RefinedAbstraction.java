package com.sap.mervyn.designpattern.bridge.general;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void request() {
        super.request();
        super.getImpl().doAnything();
    }
}

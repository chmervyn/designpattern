package com.sap.mervyn.designpattern.flyweight.general;

public class ConcreteFlyWeight1 extends FlyWeight {

    public ConcreteFlyWeight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        // 业务逻辑
    }
}

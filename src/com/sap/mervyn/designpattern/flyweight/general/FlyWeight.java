package com.sap.mervyn.designpattern.flyweight.general;

public abstract class FlyWeight {
    // 内部状态
    private String intrinsic;

    // 外部状态
    protected final String extrinsic;

    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    // 定义业务操作
    public abstract void operate();

    // 内部状态的getter/setter


    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}

package com.sap.mervyn.designpattern.responsibilitychain;

public class Woman implements IWoman {
    private int type;
    private String request = "";

    public Woman(int type, String request) {
        this.type = type;
        switch(type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}

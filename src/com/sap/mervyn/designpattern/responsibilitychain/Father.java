package com.sap.mervyn.designpattern.responsibilitychain;

public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    public void response(IWoman woman) {
        System.out.println("--------女儿向父亲请示--------");
        System.out.println(woman.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}

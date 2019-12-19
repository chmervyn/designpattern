package com.sap.mervyn.designpattern.responsibilitychain;

public abstract class Handler {

    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;

    private int level;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public void handlerMessage(IWoman woman) {
        if (woman.getType() == this.level) {
            this.response(woman);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handlerMessage(woman);
            } else {
                System.out.println("---没地方请示了，按不同意处理---");
            }
        }
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void response(IWoman woman);

}

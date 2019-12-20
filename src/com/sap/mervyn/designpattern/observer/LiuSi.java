package com.sap.mervyn.designpattern.observer;

public class LiuSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了。。。");
        this.cry(context);
        System.out.println("刘斯：乐死了。。。\n");
    }

    private void cry(String context) {
        System.out.println("刘斯：因为" + context + "，--所以我快乐呀！");
    }
}

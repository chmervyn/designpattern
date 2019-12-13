package com.sap.mervyn.designpattern.proxy.general;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }


    @Override
    public void request() {
        this.before();
        subject.request();
        this.after();
    }

    // 预处理
    public void before() {
        // do something
    }

    // 善后处理
    public void after() {
        // do something
    }

}

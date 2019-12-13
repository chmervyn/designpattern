package com.sap.mervyn.designpattern.proxy.dynamicproxy.model;

import java.lang.reflect.InvocationHandler;

public class Client {

    public static void main(String[] args) {
        Subject subject = new ReadSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);

        proxy.doSomething("Finish");

        proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Finish again");

    }
}

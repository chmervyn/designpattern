package com.sap.mervyn.designpattern.proxy.dynamicproxy.model;

import java.lang.reflect.Proxy;

public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            // 执行一个前置通知
            new BeforeAdvice().exec();
        }

        // 执行目标，并返回结果
        return (T) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                                            subject.getClass().getInterfaces(),
                                            new MyInvocationHandler(subject));
    }

}

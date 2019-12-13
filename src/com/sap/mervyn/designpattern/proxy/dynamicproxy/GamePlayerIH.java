package com.sap.mervyn.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {
    private final Object target;

    public GamePlayerIH(final Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target, args);

        if ("login".equalsIgnoreCase(method.getName()))
            System.out.println("有人在用我的账号登陆！");

        System.out.println();
        return result;
    }
}

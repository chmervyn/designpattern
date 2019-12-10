package com.sap.mervyn.subtype;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Father {

    public Collection<String> doSomething(HashMap<String, String> map) {
        System.out.println("父类被执行...");
        return map.values();
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();

        Father father = new Father();
        Son son = new Son();

        father.doSomething(map);
        son.doSomething(map);

        // father.doSomething(map1);  compile error
        son.doSomething(map1);

    }

}

class Son extends Father {
    // @Override    it's overload, not overwrite
    public Collection<String> doSomething(Map<String, String> map) {
        System.out.println("子类被执行...");
        return map.values();
    }
}

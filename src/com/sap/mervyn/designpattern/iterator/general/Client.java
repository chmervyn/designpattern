package com.sap.mervyn.designpattern.iterator.general;

public class Client {

    public static void main(String[] args) {
        Aggregate agg = new ConcreteAggregate();
        agg.add("abc");
        agg.add("aaa");
        agg.add("1234");

        Iterator<String> iterator = agg.iterator();
        String result;
        while (iterator.hasNext()) {
            result = iterator.next();
            System.out.println(result);
        }
    }

}

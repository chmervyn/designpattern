package com.sap.mervyn.designpattern.prototype.lowdeepcopy;

public class Client {

    public static void main(String[] args) {
        System.out.println("##### low copy #####");
        LowCopyThing low = new LowCopyThing();
        low.setValue("aaa");
        LowCopyThing lowCopied = low.clone();
        lowCopied.setValue("bbb");
        System.out.println("low copy original: " + low.getValues());
        System.out.println("low copy copied: " + lowCopied.getValues());

        System.out.println("##### deep copy #####");
        DeepCopyThing deep = new DeepCopyThing();
        deep.setValue("aaa");
        DeepCopyThing deepCopied = new DeepCopyThing();
        deepCopied.setValue("bbb");
        System.out.println("deep copy original: " + deep.getValues());
        System.out.println("deep copy copied: " + deepCopied.getValues());


    }
}

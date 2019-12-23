package com.sap.mervyn.designpattern.memento.extend.multiplestates;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState1("中国");
        originator.setState2("强盛");
        originator.setState3("繁荣");
        System.out.println("=====初始化状态=====" + originator);
        caretaker.setMemento(originator.createMemento());

        originator.setState1("软件");
        originator.setState2("架构");
        originator.setState3("优秀");
        System.out.println("=====修改后状态=====" + originator);

        originator.restoreMemento(caretaker.getMemento());
        System.out.println("=====恢复后状态=====" + originator);
    }

}

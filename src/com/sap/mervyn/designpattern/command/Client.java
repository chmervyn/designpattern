package com.sap.mervyn.designpattern.command;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("---------------customer asks to add requirement---------------");

        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();

        command = new DeletePageCommand();
        invoker.setCommand(command);
        invoker.action();
    }

}

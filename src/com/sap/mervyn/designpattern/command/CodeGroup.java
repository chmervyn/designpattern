package com.sap.mervyn.designpattern.command;

public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("find code group...");
    }

    @Override
    public void add() {
        System.out.println("customer asks to add function...");
    }

    @Override
    public void delete() {
        System.out.println("customer asks to delete function...");
    }

    @Override
    public void change() {
        System.out.println("customer asks to change function...");
    }

    @Override
    public void plan() {
        System.out.println("customer asks to plan function...");
    }
}

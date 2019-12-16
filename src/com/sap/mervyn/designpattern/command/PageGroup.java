package com.sap.mervyn.designpattern.command;

public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("find page group...");
    }

    @Override
    public void add() {
        System.out.println("customer asks to add page...");
    }

    @Override
    public void delete() {
        System.out.println("customer asks to delete page...");
    }

    @Override
    public void change() {
        System.out.println("customer asks to change page...");
    }

    @Override
    public void plan() {
        System.out.println("customer asks to plan page...");
    }
}

package com.sap.mervyn.designpattern.command;

public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("find requirement group...");
    }

    @Override
    public void add() {
        System.out.println("customer asks to add requirement...");
    }

    @Override
    public void delete() {
        System.out.println("customer asks to delete requirement...");
    }

    @Override
    public void change() {
        System.out.println("customer asks to change requirement...");
    }

    @Override
    public void plan() {
        System.out.println("customer asks to plan requirement...");
    }
}

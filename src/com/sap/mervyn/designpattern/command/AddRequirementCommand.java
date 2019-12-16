package com.sap.mervyn.designpattern.command;

public class AddRequirementCommand extends Command {

    @Override
    public void execute() {

        super.rg.find();

        super.rg.add();

        super.rg.plan();

    }
}

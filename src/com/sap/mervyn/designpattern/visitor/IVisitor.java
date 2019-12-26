package com.sap.mervyn.designpattern.visitor;

public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

}

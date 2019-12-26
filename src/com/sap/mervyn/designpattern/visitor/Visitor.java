package com.sap.mervyn.designpattern.visitor;

public class Visitor implements IVisitor {

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        StringBuilder info = new StringBuilder();
        info.append("姓名：").append(employee.getName()).append("\t")
                .append("性别：").append(employee.getSex() == Employee.FEMALE ? "女" : "男").append("\t")
                .append("薪水：").append(employee.getSalary()).append("\t");

        return info.toString();
    }

    private String getManagerInfo(Manager manager) {
        StringBuilder info = new StringBuilder();
        info.append(getBasicInfo(manager)).append("业绩：").append(manager.getPerformance()).append("\t");

        return info.toString();
    }

    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        StringBuilder info = new StringBuilder();
        info.append(getBasicInfo(commonEmployee)).append("业绩：").append(commonEmployee.getJob()).append("\t");

        return info.toString();
    }


}

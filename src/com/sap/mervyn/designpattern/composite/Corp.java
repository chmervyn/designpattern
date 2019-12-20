package com.sap.mervyn.designpattern.composite;

public abstract class Corp {
    private final String name;
    private final String position;
    private final int salary;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("姓名：").append(this.name).append("\t")
                .append("职位：").append(this.position).append("\t")
                .append("薪水：").append(this.salary);
        return info.toString();
    }

}

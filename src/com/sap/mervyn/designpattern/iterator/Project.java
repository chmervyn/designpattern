package com.sap.mervyn.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {
    private final List<IProject> projectList = new ArrayList<>();
    private String name = "";
    private int num;
    private int cost;

    public Project() {}

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        StringBuilder info = new StringBuilder();
        info.append("项目名称是：").append(this.name).append("\t")
                .append("项目人数：").append(this.num).append("\t")
                .append("项目费用：").append(this.cost);

        return info.toString();
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(projectList);
    }
}

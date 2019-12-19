package com.sap.mervyn.designpattern.decorator;

public class SortScoreDecorator extends Decorator {

    public SortScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        reportSort();
        super.report();
    }
}

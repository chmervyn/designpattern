package com.sap.mervyn.designpattern.decorator;

public class Father {

    public static void main(String[] args) {
        SchoolReport sr;

        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortScoreDecorator(sr);
        sr.report();

        sr.sign("老三");

    }

}

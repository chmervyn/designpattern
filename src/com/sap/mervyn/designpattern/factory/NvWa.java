package com.sap.mervyn.designpattern.factory;

public class NvWa {

    public static void main(String[] args) {

        AbstractHumanFactory yinYangLu = new HumanFactory();
        Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.say();

        Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.say();

        Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.say();

        System.out.println("=================================");

        // simple factory
        Human person = SimpleHumanFactory.createHuman(WhiteHuman.class);
        person.getColor();
        person.say();

        person = SimpleHumanFactory.createHuman(BlackHuman.class);
        person.getColor();
        person.say();

        person = SimpleHumanFactory.createHuman(YellowHuman.class);
        person.getColor();
        person.say();
    }

}

package com.sap.mervyn.designpattern.bridge;

public class Client {

    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这样运行的-------");

        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        System.out.println();

        System.out.println("-------山寨公司是这样运行的-------");

        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();

        shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        shanZhaiCorp.makeMoney();
    }

}

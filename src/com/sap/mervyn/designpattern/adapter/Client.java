package com.sap.mervyn.designpattern.adapter;

public class Client {

    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        youngGirl.getMobileNumber();

        youngGirl = new OuterUserInfo();
        String mobile = youngGirl.getMobileNumber();
        System.out.println(mobile);
    }

}

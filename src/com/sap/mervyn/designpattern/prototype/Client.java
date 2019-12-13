package com.sap.mervyn.designpattern.prototype;

import java.util.Random;

public class Client {
    private static final int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;

        final Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");

        while (i < MAX_COUNT) {
            new Thread(() -> {
                Mail cloneMail = mail.clone();
                cloneMail.setAppellation(getRandString(5) + "先生/女士");
                cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");

                sendMail(cloneMail);
            }).start();

            i++;
        }

    }

    private static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t...发送成功！");
    }

    private static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rnd = new Random();

        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rnd.nextInt(source.length())));
        }

        return sb.toString();
    }
}

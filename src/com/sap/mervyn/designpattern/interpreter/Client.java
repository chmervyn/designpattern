package com.sap.mervyn.designpattern.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入表达式：");

        String expStr = scan.nextLine();

        Map<String, Integer> var = getValue(expStr, scan);

        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + "=" + cal.run(var));

    }

    public static Map<String, Integer> getValue(String expStr, Scanner scan) {
        Map<String, Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + ch + "的值：");
                    map.put(String.valueOf(ch), Integer.valueOf(scan.nextInt()));
                }
            }
        }

        return map;
    }

}

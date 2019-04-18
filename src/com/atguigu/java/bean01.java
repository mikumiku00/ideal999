package com.atguigu.java;

/**
 * @author miku00
 * @create 2019-04-1815:59
 */
public class bean01 {
    private static String address;
    private  String name;
    private int age;

    public static void setAddress(String address) {
        bean01.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

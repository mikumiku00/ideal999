package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class Customer {


    public static void main(String[] args) {

        System.out.println("hello world!!!");
        new Customer().one("元元在干哈");

    }

    public void one(String str) {

        char[] ar = str.toCharArray();
        List list = new ArrayList();

        /*for (int x = 0; x < ar.length; x++) {

            list.add(ar[x]);
        }*/
        for (char arr :ar) {
            list.add(arr);
        }

         list.add("我爱你");

        //便利list

        System.out.println(list.toString());


    }
}



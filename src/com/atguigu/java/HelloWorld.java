package com.atguigu.java;


import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.List;
//这是该后的颜色
public class HelloWorld {
    private static final Customer cust=new Customer();

    public static void main(String[] args) {
        List list=new ArrayList();
         System.out.println("hello world!!!");
         HelloWorld.abb();
         abb();
         new HelloWorld().Abb();


    }

    public  static void abb(){


        System.out.println("233");
    }

    public  void Abb(){

        cust.one("元元");
        this.abb();
        System.out.println("23333333");
    }
}

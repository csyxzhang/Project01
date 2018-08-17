package cn.edu.scut.bean;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

import java.util.ArrayList;
import java.util.Date;

public class Customer {



    private static int a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;


    public static void main(String[] args) {
        System.out.println("helloworld");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


    }

    public static void jj() {
        System.out.println("helloworld1111!");

        a = 10;

        ArrayList list = new ArrayLIst();

        for (Object o : list) {
            
        }

        Date date = new Date();

        System.out.println(date.toString());


    }
}

package com.spring;/*
 *@author XSL
 *@date 2020/11/25-17:13
 *@Description:com.spring
 */

import java.io.Serializable;

public class TEST implements Serializable {
    private static final int AGE = 10;
//    public static final int NAME=20


    private static final long serialVersionUID = -7860404952359250319L;

    public static void main(String[] args) {
        String abc = "a";
        System.out.println(abc);
        Person person = new Person();
        person.setAge("10");
        person.setName("xcy");

        person.eat();
        System.out.println(person.toString());
        System.out.println("hello world");


    }
}
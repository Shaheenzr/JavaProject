package com.company;

public class LastIndexOfEx {
    public static void main(String args[])
    {
        String ex = "hello world hello";
        System.out.println(ex.lastIndexOf("hello",-5));
        System.out.println(ex.lastIndexOf("hello",0));
        System.out.println(ex.lastIndexOf("hello",99));
        System.out.println("length of string: "+ ex.length());
        System.out.println(ex.lastIndexOf(""));
        System.out.println(ex.lastIndexOf("",0));
        System.out.println(ex.lastIndexOf("",13));
        System.out.println(ex.lastIndexOf("",17));
        System.out.println(ex.lastIndexOf("",99));
    }
}

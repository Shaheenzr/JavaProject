package com.company;

public class ValueOfEx {
    public static void main(String args[]){
        int num = 123;
        String str =  String.valueOf(num);
        System.out.println(str + 99);

        String s = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s == s2);
        System.out.println(s3==s4);
        System.out.println(s==s3);
        System.out.println(s.equals(s3));

        String name = new String("shaheen");
        String name1 = new String("shaheen");
        System.out.println(name == name1);

        String str1 = "Hello";
        str1.concat("Sweetheart");
        System.out.println(str1);
        str1 = "Hi";
        System.out.println(str1);

        if(str1 == "Hello")
        {
            System.out.println("comparing strings");
        }
    }
}

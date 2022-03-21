package com.company;

public class StringMethods {
    public static void main(String args[])
    {
        //given string
        String s = "This is just a sample string";

        //checking whether the given string starts with "This"
        System.out.println(s.startsWith("This"));

        //checking whether the given string starts with "Hi"
        System.out.println(s.startsWith("Hi"));

        System.out.println(s.startsWith("is", 5));
        System.out.println(s.endsWith("ng"));
        //System.out.println(s.length());
        System.out.println("IndexOf: part1");
        System.out.println("hello world".indexOf("")); // returns 0
        System.out.println("hello world".indexOf("", 0));// returns 0
        System.out.println("hello world".indexOf("", 3)); // returns 3
        System.out.println("hello world".indexOf("", 8));// returns 8

        System.out.println("IndexOf: part2");
        System.out.println("hello world hello".indexOf('o', -5));//returns 4
        System.out.println("hello world hello".indexOf("world", 12));//returns -1
        System.out.println("hello world hello".indexOf("world", 99));//returns -1
        System.out.println("hello world hello".indexOf("hello", 0));

        System.out.println("lastIndexOf:part 1");
        System.out.println("hello world hello".lastIndexOf("hello", -5));//returns -1
        System.out.println("hello world hello".lastIndexOf("world", 4));//returns -1
        System.out.println("hello world hello".lastIndexOf("hello", 99));//returns 12
        System.out.println("hello world hello".lastIndexOf("hello", 0));// returns 0
        System.out.println("canal".lastIndexOf('c', -5));

        System.out.println("lastIndexOf:part 2");
        System.out.println("hello world".lastIndexOf("")); // returns 0
        System.out.println("hello world".lastIndexOf("", 0));// returns 0
        System.out.println("hello world".lastIndexOf("", 3)); // returns 3
        System.out.println("hello world".lastIndexOf("", 8));// returns 8
        System.out.println("hello world".lastIndexOf("", 11));
        System.out.println("hello world".lastIndexOf("", 50));

        System.out.println("Substring");
        String letters = "abcdefghiassi";
        String subOne, subTwo;
        subOne = letters.substring(6);
        subTwo = letters.substring(6,13);
        System.out.println(subOne);
        System.out.println(subTwo);

    }
}

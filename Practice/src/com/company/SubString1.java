package com.company;

public class SubString1 {
    public static void main(String args[]){
        String letters = "abcdefghijklmabcdefghiassi";
        String SubOne, SubTwo;
        SubOne =letters.substring(19);
        SubTwo = letters.substring(20,26);
        System.out.println(SubOne);
        System.out.println(SubTwo);

        StringBuffer sb = new StringBuffer("abcdefghijk");
        sb.insert(3, "123");
        System.out.println(sb);
    }
}

package com.company;

@FunctionalInterface
interface MyInterface{
    String reverse(String n);
}

public class LambdaEx1 {
    public static void main(String args[]){
        MyInterface ref = (str) -> {
            String result ="";
            for(int i = str.length()-1;i>=0;i--){
                result+=str.charAt(i);
            }
            return result;
        };

        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}

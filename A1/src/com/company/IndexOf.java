package com.company;

public class IndexOf {

    public static void main(String args[])
    {

        // Initialising String
        String bWhale = new String("Blue Whale are Whale who are Blue in color in Blue water  ");

        System.out.println(bWhale.indexOf("Whale",-5));

        System.out.print("Found Blue at or after 10th index at position : ");

        System.out.println(bWhale.indexOf("Blue",10));



        System.out.print("Found Blue at or after 29th index at position : ");
        System.out.println(bWhale.indexOf("Blue",29));

        System.out.print("Found Blue at or after 31st index at position : ");
        System.out.println(bWhale.indexOf("Blue",31));

        System.out.print("Found Blue at or after 46th index at position : ");
        System.out.println(bWhale.indexOf("Blue",46));

        System.out.print("Found Blue at or after 47th index at position : ");
        System.out.println(bWhale.indexOf("Blue",47));

        System.out.print("Found Whale at or after 5th index at position : ");
        System.out.println(bWhale.indexOf("Whale",5));

        System.out.print("Found Whale at or after 6th index at position : ");
        System.out.println(bWhale.indexOf("Whale",6));

        System.out.print("Found Whale at or after 15th index at position : ");
        System.out.println(bWhale.indexOf("Whale",15));

        System.out.print("Found Whale at or after 16th index at position : ");
        System.out.println(bWhale.indexOf("Whale",16));

        System.out.println(bWhale.indexOf(""));
        System.out.println(bWhale.indexOf("",0));
        System.out.println(bWhale.indexOf("",30));
        System.out.println("length of string: "+ bWhale.length());
        System.out.println(bWhale.indexOf("",58));
        System.out.println(bWhale.indexOf("",99));

    }
}

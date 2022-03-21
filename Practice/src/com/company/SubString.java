package com.company;

public class SubString {

    public static void main(String[] args){
        String str;
        str = quotedString("it was a good Movie!>",'<','>');
        System.out.println("\tSub-String is " +str);
    }

    public static String quotedString(String from, char start, char end)
    {
        int startPos = from.indexOf(start);
        int endPos = from.lastIndexOf(end);
        if(startPos == -1) //no start found
            return null;
        else if(endPos == -1)
            return from.substring(startPos);
        else //both start and end found
            return from.substring(startPos, endPos +1);
    }
}

package com.company;

public class LastWord {
    public static void main(String args[]){
        String test =  "This is a sentence";
        String lastWord = test.substring(test.lastIndexOf(" ")+1);
        System.out.println(lastWord);
        String str = "      Geeks     for    Geeks        ";

        // Call the replaceAll() method
        //str = str.replaceAll("\\s", "");

        System.out.println("trimmed:" + str.strip());
        System.out.println("trimmed:" + str.replace(" ",""));

        System.out.println("last"+ str.substring(str.lastIndexOf(" ")+1));
    }

}

package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class NazarShaheenA3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking three inputs from user
        System.out.print("Str1: ");
        String str1 = sc.nextLine();

        System.out.print("Str2: ");
        String str2 = sc.nextLine();
        if (isAnagramSort(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }


    }

    static boolean isAnagramSort(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
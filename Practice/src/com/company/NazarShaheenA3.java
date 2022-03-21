package com.company;
import java.util.Arrays;
import java.util.Scanner;
/**
  *This program takes 3 user input strings
  *First string is checked for being a palindrome.
  *Second and third string ar checked for being anagram.

  $$$ javatpoint.com,stackoverflow.com and geeksforgeeks.com
      has been referenced for coming up of this program $$$
*/
public class NazarShaheenA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking three inputs from user
        System.out.print("Str1: ");
        String str1 = sc.nextLine();

        System.out.print("Str2: ");
        String str2 = sc.nextLine();

        System.out.print("Str3: ");
        String str3 = sc.nextLine();

       //checking if user input for palindrome check is valid input.
        if(str1.isEmpty()){
            System.err.println("Input string [str1] is empty, therefore considered invalid input for palindrome check");
        }else {
            // calling the method for checking if 1st input string is palindrome
            if (isPalindrome(str1)) {
                System.out.println("The given string is palindrome.");
            } else {
                System.out.println("The given string is not palindrome.");
            }
        }
        //checking if user inputs for anagram check are valid inputs
        if ((str2.isEmpty() || str3.isEmpty()) | (str2.isBlank() || str3.isBlank())){
            System.err.println("Input values for [Str2] [Str3] are either empty or blank,therefore considered invalid for anagram check.");
        }else{
            // calling the method for checking if 2nd and 3rd input string are anagram
            if (isAnagram(str2,str3)) {
                System.out.println(str2 +" and " + str3 + " are anagrams of each other.");
            } else {
                System.out.println(str2 +" and " + str3 + " are not anagrams of each other.");
            }
        }


        System.out.println("Program completed");
    }
    /*
      This method takes a string and checks if that string is a palindrome or not.
      returns true or false
    */
    static boolean isPalindrome(String string1){
            //considering blank input string as palindrome
            if ( string1.isBlank()) {
                return true;
            }
            //considering all other input strings for palindrome check
            else
            {
                //removing all the special characters and spaces
                string1 = string1.replaceAll("[^a-zA-Z0-9]", "");

                //changing to lower case
                string1 = string1.toLowerCase();

                int length = string1.length();
                String reverse = "";

                //loop to reverse a string
                for (int i = length - 1; i >= 0; i--)
                    reverse = reverse + string1.charAt(i);

                //conditional statement to compare string in reverse order
                if (string1.equals(reverse))
                    return true;
                else
                    return false;

        }
    }
    /*
       This method takes two strings and checks if they are anagram of each other.
       returns true or false
    */
    static boolean isAnagram(String string2, String string3) {
        //removing any white spaces
        String s1 = string2.replaceAll("\\s", "");
        String s2 = string3.replaceAll("\\s", "");

        if (s1.length() != s2.length()) {
            return false;
        } else {
            //changing to lower case and to character array
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();

            //sorting the arrays
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);

            //cheking if two arrays contain the same elements in the same order
            if(Arrays.equals(ArrayS1, ArrayS2))
                return true;
            else
                return false;
        }

    }
}

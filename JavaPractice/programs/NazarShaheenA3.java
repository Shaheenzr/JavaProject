import java.util.Arrays;
import java.util.Scanner;

public class NazarShaheenA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Str1: ");
        String str1 = sc.nextLine();
        System.out.print("Str2: ");
        String str2 = sc.nextLine();
        System.out.print("Str3: ");
        String str3 = sc.nextLine();
        if (str1.isEmpty()) {
            System.err.println("Input string [str1] is empty, therefore considered invalid input for palindrome check");
        } else if (isPalindrome(str1)) {
            System.out.println("The given string is palindrome.");
        } else {
            System.out.println("The given string is not palindrome.");
        }

        if ((str2.isEmpty() || str3.isEmpty()) | (str2.isBlank() || str3.isBlank())) {
            System.err.println("Input values for [Str2] [Str3] are either empty or blank,therefore considered invalid for anagram check.");
        } else if (isAnagram(str2, str3)) {
            System.out.println(str2 + " and " + str3 + " are anagrams of each other.");
        } else {
            System.out.println(str2 + " and " + str3 + " are not anagrams of each other.");
        }

        System.out.println("Program completed");
    }

    static boolean isPalindrome(String string1) {
        if (string1.isBlank()) {
            return true;
        } else {
            string1 = string1.replaceAll("[^a-zA-Z0-9]", "");
            string1 = string1.toLowerCase();
            int length = string1.length();
            String reverse = "";

            for(int i = length - 1; i >= 0; --i) {
                reverse = reverse + string1.charAt(i);
            }

            return string1.equals(reverse);
        }
    }

    static boolean isAnagram(String string2, String string3) {
        String s1 = string2.replaceAll("\\s", "");
        String s2 = string3.replaceAll("\\s", "");
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            return Arrays.equals(ArrayS1, ArrayS2);
        }
    }
}

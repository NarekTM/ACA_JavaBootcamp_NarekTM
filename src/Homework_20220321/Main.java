package Homework_20220321;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Task 01
        Integer[] array1 = {1, 2, 4, 3, 4, 5, 3, 3};
        System.out.println(containsDuplicateElement(array1));

        //Task 02
        Integer[] array2 = {1, 2, 3, 4, 3, 4, 5, 3, 3, 8, 8};
        printUniqueElements(array2);

        //Task 03
        String str1 = "aghjapoaiacqweca";
        System.out.println(countOfDuplicateChars(str1));

        //Task 04
        String str2 = "aabbcc";
        System.out.println(firstUniqueChar(str2));

//        //Task 05
//        String str3 = "asd";
//        String str4 = "abba";
//        String str5 = "abcdaefjh";
//        String str6 = "abada";
//        String str7 = "abbaccca";
//        String str8 = "ababab";
//        String str9 = "abcdaefajh";
//        System.out.printf("%-9s\t-\tlongest substring without repeating characters' length: \t%s\t(should be 3)\n",
//                str3, lengthOfLongestUniquesSubstring(str3));
//        System.out.printf("%-9s\t-\tlongest substring without repeating characters' length: \t%s\t(should be 2)\n",
//                str4, lengthOfLongestUniquesSubstring(str4));
//        System.out.printf("%-9s\t-\tlongest substring without repeating characters' length: \t%s\t(should be 8)\n",
//                str5, lengthOfLongestUniquesSubstring(str5));
//        System.out.printf("%-9s\t-\tlongest substring without repeating characters' length: \t%s\t(should be 3)\n",
//                str6, lengthOfLongestUniquesSubstring(str6));
//        System.out.printf("%-9s\t-\tlongest substring without repeating characters' length: \t%s\t(should be 3)\n",
//                str7, lengthOfLongestUniquesSubstring(str7));
//        System.out.printf("%-9s\t-\tlongest substring without repeating characters' length: \t%s\t(should be 2)\n",
//                str8, lengthOfLongestUniquesSubstring(str8));
//        System.out.printf("%-9s\t-\tlongest substring without repeating characters' length: \t%s\t(should be 6)\n",
//                str9, lengthOfLongestUniquesSubstring(str9));
    }

    /**
     * Task 01. Write a method which will check if given array of
     * integers contains duplicate element.
     */
    public static boolean containsDuplicateElement(Integer[] array) {
        Set<Integer> arraySet = new HashSet<>();

        for (Integer integer : array) {
            if (!arraySet.add(integer)) {
                return true;
            }
        }
        return false;

        /*
        for (int i = 0; i < array.length; i++) {
            arraySet.add(array[i]);
        }
        return !(array.length == arraySet.size());
         */

        /*
        Set<Integer> arraySet = new HashSet<Integer>(List.of(array));
        return !(array.length == arraySet.size());
         */
    }

    /**
     * Task 02. Write a method which prints elements that occurred only once in the array.
     */
    public static void printUniqueElements(Integer[] array) {
        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }
        Set<Integer> arraySet = new HashSet<>();
        for (Integer integer : array) {
            if (!arraySet.add(integer)) {
                arraySet.remove(integer);
            }
        }
        for (Integer integer : arraySet) {
            System.out.print(integer + " ");
        }
    }

    /**
     * Task 03. Write a method that counts duplicate characters from a given string.
     */
    public static int countOfDuplicateChars(String str) {
        Map<Character, Integer> strMap = new HashMap<>();
        int strLength = str.length();
        int count = 0;
        for (int i = 0; i < strLength; i++) {
            if (!strMap.containsKey(str.charAt(i))) {
                strMap.put(str.charAt(i), 1);
            } else {
                strMap.put(str.charAt(i), strMap.get(str.charAt(i)) + 1);
            }
            if (strMap.get(str.charAt(i)) == 2) {
                count++;
            }
        }
        return count;
    }

    /**
     * Task 04. Write a method that return s the first non-repeated character from a given string.
     */
    public static char firstUniqueChar(String str) {
        Map<Character, Integer> strMap = new HashMap<>();
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            if (strMap.put(str.charAt(i), 1) != null) {
                strMap.put(str.charAt(i), strMap.get(str.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < strLength; i++) {
            if (strMap.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return ' ';
    }

    /**
     * Task 05. Write a method which will return the length of the
     * longest substring without repeating characters.
     * “abba” – 2, “abcdaefjh” – 8
     */
}










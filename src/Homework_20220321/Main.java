package Homework_20220321;

import javax.imageio.metadata.IIOMetadataFormatImpl;
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
//        System.out.println(lengthOfLongestUniquesSubstring(str6));

    }

    public static boolean containsDuplicateElement(Integer[] array) {
        Set<Integer> arraySet = new HashSet<Integer>();

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

    public static void printUniqueElements(Integer[] array) {
        if (array.length == 1) {
            System.out.println(array[0]);
            return;
        }
        Arrays.sort(array);
        Set<Integer> arraySet = new HashSet<Integer>();
        for (int i = 0; i < array.length - 1; i++) {
            if (!arraySet.contains(array[i]) && array[i] != array[i + 1]) {
                System.out.println(array[i]);
            }
            arraySet.add(array[i]);
        }
        if (!arraySet.contains(array[array.length - 1])) {
            System.out.println(array[array.length - 1]);
        }
    }

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

//    public static int lengthOfLongestUniquesSubstring(String str) {
//        Map<Character, Integer> strMap = new HashMap<>();
//        int strLength = str.length();
//        for (int i = 0; i < strLength; i++) {
//            strMap.put(str.charAt(i), 1);
//        }
//
//        Map<Integer, Character> strMap2 = new HashMap<>();
//        //int strLength = str.length();
//        for (int i = 0; i < strLength; i++) {
//            strMap2.put(i, str.charAt(i));
//        }
//
//        int arraySize = (int) (strMap2.size() * (double)(strMap2.size() / 2) + (double)(strMap2.size() / 2));
//        String[] array = new String[arraySize];
//        return 0;
//    }

//    public static int lengthOfLongestUniquesSubstring2(String str) {
//        Map<String, Integer> strMap = new HashMap<>();
//        int strLength = str.length();
//        for (int i = 0; i < strLength; i++) {
//            for (int j = 0; j < strLength - i; j++) {
//                strMap.put(str.substring(i, strLength - j), str.substring(i, strLength - j).length());
//            }
//        }
//        String longest = str.substring(0, 1);
//        for (String sub : strMap.keySet()) {
//            if (!containsDuplicateElementString(sub) && sub.length() > longest.length()) {
//                longest = sub;
//            }
//        }
//        return longest.length();
//    }
//
//    public static boolean containsDuplicateElementString(String str) {
//        Set<Character> arraySet = new HashSet<Character>();
//
//        for (int i = 0; i < str.length(); i++) {
//            if (!arraySet.add(str.charAt(i))) {
//                return true;
//            }
//        }
//        return false;
//    }

}










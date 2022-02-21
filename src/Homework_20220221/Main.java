package Homework_20220221;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String str = "Armenia";
        //Task 01
        System.out.println(lengthOfString(str));
        //Task 02
        System.out.println(charFromString(str, 0));
        //Task 03
        System.out.println(stringContainsChar(str, 'n'));

        //Task 04
        System.out.print("Enter your string: ");
        String str1 = scan.nextLine();
        System.out.println("The count of vowels in given string is: " + countOfVowels(str1));

        //Task 05
        System.out.print("Enter your string: ");
        String str2 = scan.nextLine();
        reverseString(str2);

        //Task 06
        System.out.print("Enter your string: ");
        String str3 = scan.nextLine();
        countVowelsDigits(str3);

        //Task 07
        System.out.print("Enter a plaintext string: ");
        String str4 = scan.nextLine().toUpperCase();
        System.out.println("The ciphertext string is: " + caesarCode(str4));

        //Task 08
        System.out.print("Enter a string: ");
        String str5 = scan.nextLine();
        System.out.println("\"" + str5 + (isPalindrome(str5) ? "\" is palindrome." : "\" is not palindrome."));

        //Task 09
        System.out.print("Enter a binary string: ");
        String str6 = scan.nextLine();
        System.out.println("\"" + str6 + (checkBinStr(str6) ? "\" is a binary string." : "\" is not a binary string."));

        //Task 10
        System.out.print("Enter a hex string: ");
        String str7 = scan.nextLine();
        System.out.println("\"" + str7 + (checkHexStr(str7) ? "\" is a hex string." : "\" is not a hex string."));

        //Task 11
        System.out.print("Enter a Binary string: ");
        String str8 = scan.nextLine();
        bin2Dec(str8);

        //Task 12
        System.out.print("Enter a string: ");
        String str9 = scan.nextLine();
        System.out.println("Duplicate characters count in a given string is: " + dupCharsCount(str9));
        System.out.println("Duplicate characters count in a given string is: " + dupCharsCount2(str9));

        //Task 13
        System.out.print("Enter a string: ");
        String str10 = scan.nextLine();
        System.out.println("The first non-repeated character in a given string is: \'" + firstNonRepeatedChar(str10) + "\'");

        //Task 14
        System.out.print("Enter a string: ");
        String str11 = scan.nextLine();
        System.out.print("Enter a char: ");
        char ch = scan.nextLine().charAt(0);
        System.out.println("The count of occurrences of a certain character in a given string: " + occurrencesOfCharacter(str11, ch));
    }

    /**
     * Task 01. Write a function which returns the length of a given String.
     */
    public static int lengthOfString(String str) {
        return str.length();
        /*
        char[] strToChar = str.toCharArray();
        return strToChar.length;
         */
    }

    /**
     * Task 02. Write a function which returns a character of a given index, from a given String.
     * Pass as a parameters String str, int index.
     */
    public static char charFromString(String str, int index) {
        return str.charAt(index);
        /*
        char[] strChar = str.toCharArray();
        return strChar[index];
         */
    }

    /**
     * Task 03. Write a function which checks if the given String contains a given character.
     * Pass as parameters String str, char ch
     */
    public static boolean stringContainsChar(String str, char ch) {
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] == ch) {
                return true;
            }
        }
        return false;
    }

    /**
     * Task 04. Write a method which returns the count of vowels of a given String.
     */
    public static int countOfVowels(String str) {
        str = str.toLowerCase();
        char[] strChar = str.toCharArray();
        int count = 0;
        for (int i = 0; i < lengthOfString(str); i++) {
            if (strChar[i] == 'a' || strChar[i] == 'e' || strChar[i] == 'i' || strChar[i] == 'o' ||
                    strChar[i] == 'u' || strChar[i] == 'y') {
                count++;
            }
        }
        return count;
    }

    /**
     * Task 05. Write a function called reverseString, which prompts the user for a String, and prints
     * the reverse of the String by extracting and processing each character.
     * The output shall look like: Enter a String: abcdef The reverse of the String "abcdef" is "fedcba"
     */
    public static void reverseString(String str) {
        char[] strChar = str.toCharArray();
        System.out.printf("The reverse of the string \"%s\" is \"", str);
        for (int i = strChar.length - 1; i >= 0; i--) {
            System.out.print(strChar[i]);
        }
        System.out.println("\"");
    }

    /**
     * Task 06. Write a program called countVowelsDigits, which get as parameter a String, counts the number
     * of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints
     * the counts and the percentages (rounded to 2 decimal places).
     * For example`
     * Enter a String: testing12345
     * Number of vowels: 2 (16.67%)
     * Number of digits: 5 (41.67%)
     * Hints`
     * 1. To check if a char c is a digit, you can use boolean expression (c >= '0' && c <= '9'); or use built-in boolean function Character.isDigit(c).
     * 2. You could use in.next().toLowerCase() to convert the input String to lowercase to reduce the number of cases.
     * 3. To print a % using printf(), you need to use %%. This is because % is a prefix for format specifier in printf(), e.g., %d and %f.
     */
    public static void countVowelsDigits(String str) {
        char[] strChar = str.toCharArray();
        int vowelsCount = countOfVowels(str);
        int digitsCount = 0;
        for (char ch : strChar) {
            if (Character.isDigit(ch)) {
                digitsCount++;
            }
        }
        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowelsCount, ((float) vowelsCount / strChar.length * 100));
        System.out.printf("Number of digits: %d (%.2f%%)\n", digitsCount, ((float) digitsCount / strChar.length * 100));
    }

    /**
     * Task 07. Caesar's Code is one of the simplest encryption techniques. Each letter in the plaintext is
     * replaced by a letter with some fixed number of positions (n) down the alphabet cyclically.
     * In this exercise, we shall pick n=3. That is, 'A' is replaced by 'D', 'B' by 'E', 'C' by 'F', ..., 'X' by 'A', ..., 'Z' by 'C'.
     * Write a function called caesarCode to cipher Caesar's code. The program shall prompt the user
     * for a plaintext string consisting of mix-case letters only; compute the ciphertext; and print the ciphertext in uppercase.
     * For example:
     * Enter a plaintext string: Testing
     * The ciphertext string is: WHVWLQJ
     * Hints:
     * 1. Use in.next().toUpperCase() to read an input string and convert it into uppercase to reduce the number of cases.
     * 2. You can use a big nested-if with 26 cases ('A'-'Z'). But it is much better to consider 'A' to 'W' as one case; 'X', 'Y' and 'Z' as 3 separate cases.
     */
    public static String caesarCode(String str) {
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] + 3 <= 90) {
                strChar[i] += 3;
            } else if (strChar[i] + 3 == 91) {
                strChar[i] = 'A';
            } else if (strChar[i] + 3 == 92) {
                strChar[i] = 'B';
            } else {
                strChar[i] = 'C';
            }
        }
        return String.valueOf(strChar);
    }

    /**
     * Task 08. Write a function to check if the passed String palindrome or not Print “xxx” is|is not a Palindrome.
     * A word that reads the same backward as forward is called a palindrome, e.g., "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive).
     */
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length / 2; i++) {
            if (strChar[i] != strChar[strChar.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Task 09. The binary number system uses 2 symbols, 0 and 1. Write a function called checkBinStr
     * to verify a binary string. The program shall prompt the user for a binary string;
     * and decide if the input string is a valid binary string.
     * For example:
     * Enter a binary string: 10101100
     * "10101100" is a binary string
     * Enter a binary string: 10120000
     * "10120000" is NOT a binary string
     */
    public static boolean checkBinStr(String str) {
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] != '0' && strChar[i] != '1') {
                return false;
            }
        }
        return true;
    }

    /**
     * Task 10. The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f).
     * Write a program to verify a hex string. The function gets a hex string; and decides if the input string is a valid hex string.
     * For examples:
     * Enter a hex string: 123aBc
     * "123aBc" is a hex string
     * Enter a hex string: 123aBcx
     * "123aBcx" is NOT a hex string
     */
    public static boolean checkHexStr(String str) {
        str = str.toLowerCase();
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            if ((strChar[i] < '0' || strChar[i] > '9') && (strChar[i] < 'a' || strChar[i] > 'f')) {
                return false;
            }
        }
        return true;
    }

    /**
     * Task 11. Write a method called bin2Dec to convert an input binary string into its equivalent decimal number.
     * Your output shall look like:
     * Enter a Binary string: 1011
     * The equivalent decimal number for binary "1011" is: 11
     * Enter a Binary string: 1234
     * error: invalid binary string "1234"
     */
    public static void bin2Dec(String str) {
        if (!checkBinStr(str)) {
            System.out.println("Error: invalid binary string \"" + str + "\"");
            return;
        }
        char[] strChar = str.toCharArray();
        int strToInt = 0;
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[strChar.length - i - 1] == '1') {
                strToInt += powerOfNumber(2, i);
            }
        }
        System.out.println("The equivalent decimal number for binary \"" + str + "\" is: " + strToInt);
    }

    /**
     * Task 12. Write a method that counts duplicate characters in a given string.
     */
    public static int dupCharsCount(String str) {
        char[] strChar = str.toCharArray();
        Arrays.sort(strChar);
        int count = 0;
        for (int i = 1; i < strChar.length; i++) {
            if (i == 1 && strChar[i] == strChar[i - 1]) {
                count++;
                continue;
            }
            if (strChar[i] == strChar[i - 1] && strChar[i] != strChar[i - 2]) {
                count++;
            }
        }
        return count;
    }

    public static int dupCharsCount2(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                count++;
                str = str.replace(str.substring(i, i + 1), "");
            }
        }
        return count;
    }

    /**
     * Task 13. Write a method that returns the first non-repeated character in a given string.
     */
    public static char firstNonRepeatedChar(String str) {
        char[] strChar = str.toCharArray();
        boolean isNonRepeated = true;
        for (int i = 0; i < strChar.length; i++) {
            for (int j = 0; j < strChar.length; j++) {
                if (i != j && strChar[i] == strChar[j]) {
                    isNonRepeated = false;
                    break;
                }
            }
            if (isNonRepeated) {
                return strChar[i];
            }
            isNonRepeated = true;
        }
        return '\u0000';
    }

    /**
     * Task 14. Write a method that counts occurrences of a certain character in a given string.
     * Pass as an argument (String str, char ch)
     */
    public static int occurrencesOfCharacter(String str, char ch) {
        int count = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    /*
    ******************
    My helping methods
    ******************
     */
    public static int powerOfNumber(int number, int power) {
        if (number == 0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }
        int pow = 1;
        for (int i = 0; i < power; i++) {
            pow *= number;
        }
        return pow;
    }

}



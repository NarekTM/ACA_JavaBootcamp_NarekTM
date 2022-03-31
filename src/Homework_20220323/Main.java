package Homework_20220323;

public class Main {
    public static void main(String[] args) {

//        //Task 01.1
//        int[] array = {1, 2, 3, 4, 5, 6};
//        System.out.println(sumOfArray(array));
//
//        //Task 01.2
//        System.out.println(factorial(6));
//
//        //Task 02
//        System.out.println(fib(7));
//
//        //Task 03
//        System.out.println(numberOfBlocks(5));
//
//        //Task 04
//        System.out.println(sumOfNumbersDigits(102030));
//
//        //Task 05
//        System.out.println(occurrencesOfSeven(717100727));
//
//        //Task 06
//        System.out.println(countOfCharX("xxhixx"));
//        System.out.println(countOfCharX("xhixhix"));
//        System.out.println(countOfCharX("helloX"));
//
//        //Task 07
//        System.out.println(stringWithoutCharX("helloX"));
//
//        //Task 08
//        System.out.println(reverseString("hello"));
//
//        //Task 09
//        System.out.println(endX("xxre"));
//        System.out.println(endX("xxhixx"));
//
        //Task 10
        System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("abbcb"));
        System.out.println(stringClean("abbccbb"));
        System.out.println(stringClean("aaba"));
//
//        //Task 11
//        System.out.println(isPrime(91));
//
//        //Task 12
//        System.out.println(largestDigit("43921512"));
//
//        //Task 13
//        System.out.println(countOfDigits("1"));
//
//        //Task 14
//        System.out.println(addingAsterisk("abcd"));
//
//        //Task 15
//        System.out.println("Even length: " + addingParentheses("abcd"));
//        System.out.println("Odd length: " + addingParentheses("abcde"));
//
//        //Task 16
//        System.out.println(addingMirroredLine("(abc (def (g"));
//
//        //Task 17
//        System.out.println("aa: " + shortenIdenticalSymmetricalLetters("aa") + " ()");
//        System.out.println("abcba: " + shortenIdenticalSymmetricalLetters("abcba") + " (c)");
//        System.out.println("abcda: " + shortenIdenticalSymmetricalLetters("abcda") + " (bcd)");
//        System.out.println("abddba: " + shortenIdenticalSymmetricalLetters("abddba") + " ()");
//        System.out.println("zabba: " + shortenIdenticalSymmetricalLetters("zabba") + " (zabba)");
//        System.out.println("abacdcaba: " + shortenIdenticalSymmetricalLetters("abacdcaba") + " (d)");
//        System.out.println("abacdczba: " + shortenIdenticalSymmetricalLetters("abacdczba") + " (adz)");
//        System.out.println("abacdcabx: " + shortenIdenticalSymmetricalLetters("abacdcabx") + " (adx)");
    }

    /**
     * Task 01.1 Write a recursive function
     * - to find the sum of a given array.
     */
    public static int sumOfArray(int[] array) {
        int index = 0;
        int sum = array[0];
        if (index + 1 == array.length) {
            return array[index];
        }
        return sum + sumOfArray(oneShorterArray(array, ++index));
    }

    public static int[] oneShorterArray(int[] array, int index) {
        int[] newArray = new int[array.length - index];
        System.arraycopy(array, index, newArray, 0, array.length - index);
        return newArray;
    }

    /**
     * Task 01.2 Write a recursive function
     * - to find the factorial of a given natural N.
     */
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    /**
     * Task 02. Write a fib(int) function which returns n-th fibonacci number.
     */
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    /**
     * Task 03. We have triangles made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
     * the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number
     * of blocks in such a triangle with the given number of rows.
     * Example`
     * triangle(0) -> 0
     * triangle(1) -> 1
     * triangle(2) -> 3
     */
    public static int numberOfBlocks(int n) {
        if (n == 1) {
            return 1;
        }
        return n + numberOfBlocks(n - 1);
    }

    /**
     * Task 04. Given a non-negative int n, return the sum of its digits recursively (no loops).
     */
    public static int sumOfNumbersDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfNumbersDigits(n / 10);
    }

    /**
     * Task 05. Given a non-negative int n, return the count of the occurrences of 7 as a digit,
     * so for example 717 yields 2.
     */
    public static int occurrencesOfSeven(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + occurrencesOfSeven(n / 10);
        }
        return occurrencesOfSeven(n / 10);
    }

    /**
     * Task 06. Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     * Example`
     * countX("xxhixx") → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     */
    public static int countOfCharX(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.equals("")) {
            return 0;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return 1 + countOfCharX(str.substring(0, str.length() - 1));
        }
        return countOfCharX(str.substring(0, str.length() - 1));
    }

    /**
     * Task 07. Given a string, compute recursively a new string where all the 'x' chars have been removed.
     * Use` str.substring()
     */
    public static String stringWithoutCharX(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.equals("")) {
            return "";
        }
        if (str.charAt(str.length() - 1) != 'x') {
            return stringWithoutCharX(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1);
        }
        return stringWithoutCharX(str.substring(0, str.length() - 1));
    }

    /**
     * Task 08. Write recursive function that reverses the given String.
     * Example` HELLO -> OLLEH
     */
    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.equals("")) {
            return "";
        }
        return str.substring(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    /**
     * Task 09. Given a string, compute recursively a new string where all the lowercase 'x' chars
     * have been moved to the end of the string.
     * Example`
     * endX("xxre") → "rexx"
     * endX("xxhixx") → "hixxxx"
     */
    public static String endX(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            return "";
        }
        int index = 0;
        if (str.charAt(0) == 'x') {
            return endX(str.substring(index + 1)) + 'x';
        }
        return str.charAt(0) + endX(str.substring(index + 1));
    }

    /**
     * Task 10. Given a string, return recursively a "cleaned" string where adjacent chars that are
     * the same have been reduced to a single char. So "yyzzza" yields "yza".
     * Example`
     * stringClean("yyzzza") → "yza"
     * stringClean("abbbcdd") → "abcd"
     */
    public static String stringClean(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.equals("")) {
            return "";
        }
        if (str.substring(1).contains(Character.toString(str.charAt(0))) && str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    /**
     * Task 11. Write a function to determine if a number is prime or not.
     */
    public static boolean isPrime(int num) {
        return primeHelper(num, 2);
    }

    public static boolean primeHelper(int num, int divisor) {
        if (divisor > Math.sqrt(num)) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return primeHelper(num, divisor + 1);
    }

    /**
     * Task 12. Given a string containing only decimal digits. Find and display the largest digit.
     */
    public static String largestDigit(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            return "";
        }
        String digit = str.substring(0, 1);
        if (str.length() == 1) {
            return digit;
        }
        int index = 1;
        if (Integer.parseInt(digit) < Integer.parseInt(str.substring(1, 2))) {
            digit = str.substring(1, 2);
        }
        return largestDigit(digit + str.substring(index + 1));
    }

    /**
     * Task 13. You are given a string containing numbers and English letters (uppercase and lowercase).
     * Find and display the number of digits.
     */
    public static int countOfDigits(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            return 0;
        }
        char digit = str.charAt(0);
        int count = 0;
        if (isDigit(digit)) {
            count++;
        }
        if (str.length() == 1) {
            return count;
        }
        return count + countOfDigits(str.substring(1));
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    /**
     * Task 14. Given a string containing only English letters (uppercase and lowercase).
     * Add the ‘*’ (asterisk) character between letters (you don’t need to add ‘*’ before the first letter and after the last).
     * Example ` LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
     * L*I*t*B*e*o*F*L*c*S*G*B*O*F*Q*x*M*H*o*I*u*D*D*W*c*q*c*V*g*k*c*R*o*A*e*o*c*X*O
     */
    public static String addingAsterisk(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            return "";
        }
        String result = str.substring(0, 1);
        if (str.length() == 1) {
            return result;
        }
        result += "*";
        return result + addingAsterisk(str.substring(1));
    }

    /**
     * Task 15. Given a string containing only English letters (uppercase and lowercase).
     * Add opening and closing parentheses according to the following pattern:
     * "example" -> "(e (x (a (m) p) l) e)" (Added opening parentheses to the middle, closing parentheses after the middle.
     * In case the string length is even there must be 2 characters in the brackets in the middle.
     * ("card -> (c (ar) d)" but not "(c (a () r) d)"). Example` LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
     * (L(I(t(B(e(o(F(L(c(S(G(B(O(F(Q(x(M(H(o(I)u)D)D)W)c)q)c)V)g)k)c)R)o)A)e)o)c)X)O)
     */
    public static String addingParentheses(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        String result = str.substring(0, 1);
        if (length == 1) {
            return "(" + result + ")";
        }
        String str1;
        String str2;
        if (length % 2 == 0) {
            str1 = addingOpenParentheses(str.substring(0, length / 2), length / 2 + 1);
            str2 = addingCloseParentheses(str.substring(length / 2), length / 2);
        } else {
            str1 = addingOpenParentheses(str.substring(0, length / 2 + 1), length / 2 + 1);
            str2 = addingCloseParentheses(str.substring(length / 2), length / 2 + 1).substring(1);
        }
        return str1 + str2;
    }

    public static String addingOpenParentheses(String str, int n) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            return "";
        }
        String result = str.substring(0, 1);
        if (n != 0) {
            result = "(" + result;
        } else {
            return result;
        }
        return result + addingOpenParentheses(str.substring(1), n - 1);
    }

    public static String addingCloseParentheses(String str, int n) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            return "";
        }
        String result = str.substring(0, 1);
        if (n > 0) {
            result += ")";
        }
        int index = 0;
        return result + addingCloseParentheses(str.substring(index + 1), n - 1);
    }

    /**
     * Task 16. Given a string containing only English letters (uppercase and lowercase) and opening brackets.
     * Form a new line by adding a "mirrored" line with closing brackets to the right.
     * Example:
     * "(abc (def (g " --> "(abc (def (gg) fed) cba)"
     */
    public static String addingMirroredLine(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            return "";
        }
        return str + reverseStringWithCloseParentheses(str);
    }

    public static String reverseStringWithCloseParentheses(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.equals("")) {
            return "";
        }
        if (str.charAt(str.length() - 1) == '(') {
            return ")" + reverseStringWithCloseParentheses(str.substring(0, str.length() - 1));
        }
        return str.substring(str.length() - 1) + reverseStringWithCloseParentheses(str.substring(0, str.length() - 1));
    }

    /**
     * Task 17. Given a string containing only small English letters. Form a new line by "cutting"
     * identical letters located at symmetrical places (that is, if there are 2 identical letters at the same
     * distance from the center of the line, then they must be removed from the line). If the length of the
     * string is odd, then the middle letter does not need to be shortened.
     */
    public static String shortenIdenticalSymmetricalLetters(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        char first = str.charAt(0);
        char second = str.charAt(str.length() - 1);
        if (first == second) {
            return shortenIdenticalSymmetricalLetters(str.substring(1, str.length() - 1));
        }
        return first + shortenIdenticalSymmetricalLetters(str.substring(1, str.length() - 1)) + second;
    }

    /**
     * MyTask. Given a string, return recursively a "cleaned" string where all chars are unique.
     * Example`
     * stringClean("yyzzza") → "yza"
     * stringClean("abbbcdd") → "abcd"
     * stringClean("abbccbb") → "acb"
     */
    public static String stringClean2(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.equals("")) {
            return "";
        }
        if (str.substring(1).contains(Character.toString(str.charAt(0)))) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }
}
















package Homework_20220228;

public class Validator {

    public static boolean isStringLengthInGivenRange(String str, int from, int to) {
        if (str == null) {
            return false;
        }
        return str.length() >= from && str.length() <= to;
    }

    public static boolean isIntInGivenRange(int num, int from, int to) {
        return num >= from && num <= to;
    }

    public static boolean isRealGender(String str) {
        if (str == null) {
            return false;
        }
        return "male".compareToIgnoreCase(str) == 0 || "female".compareToIgnoreCase(str) == 0;
    }

    public static boolean isPassportIdValid(String str) {
        if (str == null) {
            return false;
        }
        return str.length() == 8 && "AN".equals(str.substring(0, 2)) &&
                isStringConsistOfPosNumbers(str.substring(2));
    }

    public static boolean isPhoneNumberValid(String str) {
        if (str == null) {
            return false;
        }
        return str.length() == 8 && isStringConsistOfPosNumbers(str);
    }

    public static boolean isStringConsistOfPosNumbers(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

}

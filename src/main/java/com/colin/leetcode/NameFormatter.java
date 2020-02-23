package com.colin.leetcode;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NameFormatter {

    public static String captureName(String str) {
        char[] cs = str.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

    public static String getLengthString(String oriString, int length) {
        String retString = oriString;
        if (oriString.length() == length) {
            return retString;
        } else {
            for (int i = 0; i < length - oriString.length(); i++) {
                retString = "0" + retString;
            }
        }
        return retString;
    }
}

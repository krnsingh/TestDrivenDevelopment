package com.tdd.collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {


    /**
     * Please implement this method to
     * return true if the parameter is a palindrome and false otherwise.
     * TODO : USE RECURSION
     *
     * @param s string to determine if a palindrome
     * @return true if the parameter is a palindrome and false otherwise
     */
    int length;
    int firstCheck=0;
    public boolean isPalindrome(String s) {

        if (firstCheck == 0) {
            firstCheck++;
            s=refinedText(s);
            return isPalindrome(s);
        }
        else {
            length = s.length();
            if (length == 0 || length == 1) {
                return true;
            } else {

                    if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(length - 1))) {
                        s = s.substring(1, length - 1);
                        return isPalindrome(s);
                    } else {
                        return false;
                    }
                }
        }

    }

    public String refinedText(String s)
    {
        String expression="[!?,'\\s\\.]";
        Pattern p=Pattern.compile(expression);
        Matcher m=p.matcher(s);
        s=m.replaceAll("");
        return s;
    }
}

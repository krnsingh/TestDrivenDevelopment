package com.tdd.collections;

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
    public boolean isPalindrome(String s) {

       length = s.length();
        if (length == 0 || length == 1) {
            return true;
        } else {
            // extra white spaces ' '
            if (s.charAt(0) == ' ' || s.charAt(length - 1) == ' ') {
                if (s.charAt(0) == ' ' && s.charAt(length - 1) == ' ') {
                    s = s.substring(1, length - 1);
                } else if (s.charAt(0) != ' ' && s.charAt(length - 1) == ' ') {
                    s = s.substring(0, length - 1);
                } else if (s.charAt(0) == ' ' && s.charAt(length - 1) != ' ') {
                    s = s.substring(1, length);
                }

                return isPalindrome(s);
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
}

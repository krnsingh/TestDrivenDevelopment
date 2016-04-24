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
    public boolean isPalindrome(String s) {


        int length=s.length();
        if(length==0 || length==1)
        {
            return true;
        }
        else
        {
            if(Character.toLowerCase(s.charAt(0))== Character.toLowerCase(s.charAt(length-1)))
            {
                s=s.substring(1,length-1);
                isPalindrome(s);
                return true;
            }
            else
            {
                return false;
            }
        }

    }

}

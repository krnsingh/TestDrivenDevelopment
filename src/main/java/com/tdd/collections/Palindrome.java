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

        int stringLength=s.length();
        String reverse=""; //Solution 1 variable
        boolean flag=true;  // Solution 2 variable

        switch(stringLength)
        {
            case 0:
                return true;
            case 1:
                return true;

            default:
            {
                // Solution 1
                /*for(int j=stringLength-1;j>=0;j--)
                {
                    reverse+=s.charAt(j);
                }

                if(reverse.equalsIgnoreCase(s))
                    return true;
                else
                    return false;
                */

                // Solution 2

                for(int i=0,j=stringLength-1;i<stringLength;i++,j--)
                {
                    if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j)))
                    {
                        flag= false;
                        break;
                    }
                }
                return flag;
            }


        }
    }

}

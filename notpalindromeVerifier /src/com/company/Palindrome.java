package com.company;

public class Palindrome {

    public boolean isnotPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < (n/2); ++i) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return true;
            }
        }
        return false;
    }

    public void printPalindrome(String [] CSV){
        for(int i=0; i<CSV.length;i++)
        {
            if(isnotPalindrome(CSV[i])){
                System.out.print(CSV[i]+"\n");
            }
        }
    }

}

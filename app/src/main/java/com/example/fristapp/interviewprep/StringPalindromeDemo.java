package com.example.fristapp.interviewprep;

public class StringPalindromeDemo {

    String palindrome = "nayan";
    String notPalindrome= "vrushank";

    public static void main(String[] args) {
        StringPalindromeDemo stringPalindromeDemo = new StringPalindromeDemo();
        boolean isPalindrome = stringPalindromeDemo.isPalindrome(stringPalindromeDemo.palindrome);
        System.out.println("Given String nayan is palindrome " +  isPalindrome);

        boolean isPalindrome2 = stringPalindromeDemo.isPalindrome(stringPalindromeDemo.notPalindrome);
        System.out.println("Given String vrushank is palindrome " +  isPalindrome2);
    }

    public boolean isPalindrome(String input){
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (end > start){
            if(chars[start] == chars[end]){
                start++;
                end--;
            } else {
                return  false;
            }
        }
        return true;
    }
}

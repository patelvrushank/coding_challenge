package com.example.fristapp.interviewprep;

public class StringReverseDemo {

     String name = "Vrushank";
    public static void main(String[] args) {
        StringReverseDemo stringReverseDemo = new StringReverseDemo();
        char[] charArray = stringReverseDemo.name.toCharArray();
        String reversedString = stringReverseDemo.reverse(charArray);
        System.out.println("Reversed String : " + reversedString);
    }

    public String reverse(char[] chars){
        int start = 0;
        int end = chars.length - 1;

        while (end > start){
            char temp = chars[end];  // K
            chars[end] = chars[start];  // K -> V
            chars[start] = temp;
            start++;
            end--;
        }

        return String.valueOf(chars);
    }
}

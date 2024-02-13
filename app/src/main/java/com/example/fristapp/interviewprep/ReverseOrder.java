package com.example.fristapp.interviewprep;

public class ReverseOrder {

    public static void main(String[] args) {
        int num = 1234;

       int revNum= reverseNumber(num);
        System.out.println("Reverse number of "+num+ "="+revNum);
    }
   public static int reverseNumber(int n){

        int reminder, reverseNumber=0;

        while(n>0){
            reminder= n%10;
            reverseNumber=reminder+reverseNumber*10;
            n=n/10;

        }

        return reverseNumber;
   }

}

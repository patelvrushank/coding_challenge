package com.example.fristapp.interviewprep;

public class SortArray {

    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 6, 2, 4, 6, 8, 3, 2};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }


        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

    }

}

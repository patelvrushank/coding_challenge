package com.example.fristapp.interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArrayDemo {

    int[] array = {1,1,0,1,2,3,4,5,6,7,7,8,8};

    public static void main(String[] args) {
        RemoveDuplicateFromArrayDemo obj = new RemoveDuplicateFromArrayDemo();
        HashSet<Integer> set = obj.removeDuplicate(obj.array);

        System.out.println("Removed duplicated " + Arrays.toString(set.toArray()));
    }

    public HashSet<Integer> removeDuplicate(int[] array){

        HashSet<Integer> set = new HashSet<>();
        for (int i: array) {
            set.add(i);
        }

        return set;
    }
}

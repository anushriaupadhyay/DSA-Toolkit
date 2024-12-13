package com.problems.arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] arrayInt = {10,39,45,20,89,34,0};
        reverseArray(arrayInt,0,arrayInt.length-1);
        System.out.println(Arrays.toString(arrayInt));
    }

    private static void reverseArray(int[] arrayInt, int left, int right) {
        if(left<=right) {
            int temp = arrayInt[left];
            arrayInt[left] = arrayInt[right];
            arrayInt[right] = temp;
            reverseArray(arrayInt, left+1, right-1);
        }
    }
}

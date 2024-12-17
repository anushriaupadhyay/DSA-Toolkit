package com.problems.arrays;

import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {
        int[] arr = {1,9,6,0,3,2};
        SortArrays(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void SortArrays(int[] arr) {
        int size = arr.length;
        boolean swapped =false;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}

package com.problems.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinAndMaxOfAnArray {
    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = arr.length;
        findMinAndMax(arr, arr_size);
    }

    private static void findMinAndMax(int[] arr, int arrSize) {
        if(arrSize==1) {
            System.out.println("Min element is : " + arr[0] + " And Max element is : "+ arr[1]);
        }
           Arrays.sort(arr);
           int min = arr[0];
           int max = arr[arrSize-1];

           System.out.println("Min element is : " + min + " And Max element is : "+ max);

    }
}

package com.problems.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,7,57};
        int[] arr2 = {1,2,3,5,97};
        MergeArrays(arr1,arr2);
    }

    private static void MergeArrays(int[] arr1, int[] arr2) {
        int[] result = IntStream.concat(Arrays.stream(arr1) , Arrays.stream(arr2)).sorted().toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

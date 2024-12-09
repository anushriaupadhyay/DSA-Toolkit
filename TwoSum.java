package com.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    private void twoSum(int []arr, int target) {
        int size = arr.length;
        Set<Integer> countPairSet = new HashSet<>();

        for (int i = 0; i < size; i++) {
            int complement = target - arr[i];
            if(countPairSet.contains(complement)) {
                System.out.println("Pair found : " + arr[i] + " " + complement);
                return;
            }
            countPairSet.add(arr[i]);
        }
        System.out.println("No pair found");
    }
    public static void main(String[] args) {

        int[] arr = {0, -1, 2, -3, 1};
        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(arr, 4);
        twoSum.twoSum(arr, -2);

    }
}

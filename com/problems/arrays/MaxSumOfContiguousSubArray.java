package com.problems.arrays;

import java.util.Arrays;

public class MaxSumOfContiguousSubArray {

   /* Problem Statement #
    Given an array of positive numbers and a positive number ‘k,’
    find the maximum sum of any contiguous subarray of size ‘k’.
    Example 1:
    Input: [2, 1, 5, 1, 3, 2], k=3
    Output: 9
    Explanation: Subarray with maximum sum is [5, 1, 3].
    Example 2:
    Input: [2, 3, 4, 1, 5], k=2
    Output: 7
    Explanation: Subarray with maximum sum is [3, 4].*/
   public static void main(String[] args) {
       int [] arr = {2, 1, 5, 1, 3, 2};
       int k = 3;
       int size= arr.length;
       int maxSum = Arrays.stream(arr,0,k).sum();
       int winSum = maxSum;

       for (int i=k; i<size; i++) {
           winSum += arr[i] - arr[i-k];
           maxSum = Math.max(maxSum,winSum);

       }
       System.out.println(maxSum);
   }

}

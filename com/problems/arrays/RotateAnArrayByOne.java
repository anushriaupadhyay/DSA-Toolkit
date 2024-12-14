package com.problems.arrays;

public class RotateAnArrayByOne{
    private static void rotateArray(int[] arr) {
        int size = arr.length;
        int last = arr[arr.length-1];
        for(int i = size-2; i >=0 ; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotateArray(arr);
        for (int j : arr) {
            System.out.print(j);
        }
    }
}

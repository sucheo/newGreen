package com.green.javasub.ch5;

import java.util.Arrays;

public class ArrayStudy5 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
        }
        int[] arr2 = changeArrEvenMulti(arr, 3);// 원본 안건든다. 짝수인 값은 *3처리

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
    static int[] changeArrEvenMulti(int[] arr, int idx) {
        int[] temp = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            temp[j] = arr[j];
            if (arr[j] % 2 == 0) {
                arr[j] = arr[j] * idx;
            }
        }
        return temp;
    }
}



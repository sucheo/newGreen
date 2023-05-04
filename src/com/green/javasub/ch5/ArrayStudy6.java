package com.green.javasub.ch5;

import java.util.Arrays;

public class ArrayStudy6 {
    public static void main(String[] args) {
        //          배열크기, 랜덤값시작최소값, 랜덤값 최대값
        int[] arr = getRandomArr(6, 1, 20);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = getRandomNoDuplicatedArr(6, 1, 7);
    }

    static int[] getRandomArr(int ars, int rds, int rdd) {
        int[] arr = new int[ars];
        //int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * rdd - rds + 1) + rds);

        }
        return arr;
    }

    static int[] getRandomNoDuplicatedArr(int ars, int rds, int rdd) {

        int[] arr = new int[ars];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * rdd - rds + 1) + rds);

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;

                }
            }
        }
        return arr;
    }

}
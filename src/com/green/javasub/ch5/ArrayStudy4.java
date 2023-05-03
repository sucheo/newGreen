package com.green.javasub.ch5;

import java.util.Arrays;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
        }
        changeArrEvenMulti(arr, 4);// 원본 건든다. 짝수인 값은 *3처리

        System.out.println(Arrays.toString(arr));
    }

    static void changeArrEvenMulti(int[] arr, int idx) {

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]%2==0){
        arr[j] = arr[j]*idx;
            }

        }

    }

}
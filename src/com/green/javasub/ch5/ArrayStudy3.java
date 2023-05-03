package com.green.javasub.ch5;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+10;
            if(arr[i]%2 == 0){
                arr[i]= arr[i]*2;
            }
        }
        //원본 수정, 짝수인 값은 * 2처리
        System.out.println(Arrays.toString(arr));
    }
}
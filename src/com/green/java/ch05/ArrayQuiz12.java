package com.green.java.ch05;


/*

numArr배열을 섞어주세요

 */

import java.util.Arrays;

public class ArrayQuiz12 {
    public static void main(String[] args) {

        int[] numArr = {11,14,2,7,36,35};
        int tmp = 0;

        for(int i=0; i<numArr.length; i++) {
            int j = (int)(Math.random()*numArr.length);
            tmp = numArr[i];
            numArr[i] = numArr[j];
            numArr[j] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }

}

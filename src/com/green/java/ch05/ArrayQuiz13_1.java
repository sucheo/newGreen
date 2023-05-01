package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13_1 {
    static int[] Rdx1 = new int[6];

    public static void main(String[] args) {
        int[] lottoArr = new int[6];

        setRandomValuArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));



    }
public static int getRandomeValueFromTo(int sVal, int eVal) {
    return (int)(Math.random() * (eVal - sVal + 1)) + sVal;
}
    static void setRandomValuArr(int[] lottoArr) {
        for (int i = 0; i < lottoArr.length; i++) {
            int rVal = getRandomeValueFromTo(1, 45);
            for (int j = 0; j < lottoArr.length; j++) {
                if (lottoArr[j] == 0) {
                    lottoArr[j] = rVal;
                    break;
                } else if (lottoArr[j] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }
    static void sortArr(int[] num){

        for (int i = num.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            if(num[j]>num[j+1]){
            Rdx1[j] = num[j];
            num[j] = num[j+1];
            num[j+1] = Rdx1[j];
                }
            }
        }
    }
}
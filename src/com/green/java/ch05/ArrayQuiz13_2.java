package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13_2 {
    public static void main(String[] args) {

        int[] lottoArr = new int[6];
        setRandomValuArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
    }
public static int getRandomeValueFromTo(int sVal, int eVal) {
    return (int)(Math.random() * (eVal - sVal + 1)) + sVal;
}
    static void setRandomValuArr(int[] lottoArr) {
        int i =0;
        Loop:
        while(i <lottoArr.length){
            int rVal = getRandomeValueFromTo(1,45);
            for (int j=0; j < i; j++) {
                if (lottoArr[j] == 0) {
                    continue Loop;
                    }
                }
            lottoArr[i++] = rVal;
            }

    }
}




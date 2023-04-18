package com.green.java.ch05;


/*
 numArr배열을 이용하여
 CopyArr에 deep copy 해주세요
 copyarr값을 모두 출력
 */

public class ArrayQuiz6 {
    public static void main(String[] args) {

        int[] numArr = {11,14,2,7,36,35};
        int[] copyArr = new int[numArr.length+1];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }

        numArr[0] = 999;

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]); // 출력
        }



    }
}

package com.green.java.ch05;


/*

numArr배열을 이용하여
값 리터럴 하지 않는다
1번, 1번방 값 스와이핑


 */

public class ArrayQuiz9 {
    public static void main(String[] args) {

        int[] numArr = {11,14,2,7,36,35};

        int tmp = numArr[0];
        numArr[0] = numArr[1];
        numArr[1] = tmp;

        System.out.printf("[%d", numArr[0]);
        for (int j = 1; j < numArr.length ; j++) {
            System.out.printf(", %d", numArr[j]);
        }
        System.out.printf("]");

    }
}

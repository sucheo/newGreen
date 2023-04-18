package com.green.java.ch05;


/*
 모든 방 중에 홀수값만 더해서 출력
 odd-sum: ??
 */

public class ArrayQuiz5_ {
    public static void main(String[] args) {

        int[] numArr = {11,14,2,7,36,35};
        int sum=0;

        for (int i = 0; i < numArr.length ; i++) {
            if (numArr[i] %2 != 0) {
                sum += numArr[i];
            }

        }
        System.out.println("odd-sum: " + sum);

    }
}

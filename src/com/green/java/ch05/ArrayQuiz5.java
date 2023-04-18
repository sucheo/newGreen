package com.green.java.ch05;


/*
 numArr배열을 이용하여 모든 항의 값을 더해서 출력
 */

public class ArrayQuiz5 {
    public static void main(String[] args) {

        int[] numArr = {11,14,2,7,36,35};
        int sum=0;

        for (int i = 0; i < numArr.length; i++){
           sum += numArr[i];
        }

        System.out.println("sum: "+sum);

    }
}

package com.green.java.ch05;


/*

numArr배열을 이용하여
배열의 평균값


 */

public class ArrayQuiz11 {
    public static void main(String[] args) {

        int[] numArr = {11,14,2,7,36,35};
        int sum = 0;
        double numArr_Average = 0;

        for (int j = 0; j < numArr.length ; j++) {
            sum += numArr[j];
        }

        numArr_Average = (double) sum/numArr.length;
        System.out.printf("%.2f", numArr_Average); // 소수점 2자리까지
    }
}

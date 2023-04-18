package com.green.java.ch05;
/*
numArr 배열을 이용하여
배열에 들어있는 값의 평균값을 구해주세요
 */
public class ArrayQuize11 {
    public static void main(String[] args) {
        int[] numArr = {11,14,2,7,36,35};
        double sum = 0;

        for(int i=0; i<numArr.length; i++){
            sum +=numArr[i];
        }
        double avg =sum/ numArr.length;
        System.out.printf("avg: %.2f\n",avg);

    }
}
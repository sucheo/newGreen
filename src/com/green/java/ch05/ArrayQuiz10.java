package com.green.java.ch05;


/*

numArr배열을 이용하여
가장 작은 숫자를 찾아내여 출력


 */

public class ArrayQuiz10 {
    public static void main(String[] args) {

        int[] numArr = {11,14,2,7,36,35};
        int numArr_Min_Result = numArr[0];

        for (int j = 1; j < numArr.length ; j++) {
            if(numArr_Min_Result > numArr[j]){
                numArr_Min_Result = numArr[j];
            }
        }
        System.out.println("min: " + numArr_Min_Result);

    }
}

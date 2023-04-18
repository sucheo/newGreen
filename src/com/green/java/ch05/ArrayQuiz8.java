package com.green.java.ch05;


/*

numArr배열을 이용하여
Array.Tostring 메소드 이용하지 않고
아래처럼 출력되도록 로직으로 구성하시오
[11,14,2,7,36,35]


 */

public class ArrayQuiz8 {
    public static void main(String[] args) {

        int i;
        int[] numArr = {11,14,2,7,36,35};

        System.out.printf("[%d", numArr[0]);

        for (i=1; i< numArr.length; i++)
        {
            System.out.printf(", %d", numArr[i]);
        }
        System.out.printf("]");

    }
}

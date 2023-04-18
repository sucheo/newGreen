package com.green.java.ch05;


/*

numArr배열을 이용하여
copyArr은 numArr보다 1칸 더 많게 만들어주세요
마짐가 방에는 100을 넣어주세요
copyArr에 numArr을 deep copy

copyArr값을 모두 출력해주세요


 */

public class ArrayQuiz7 {
    public static void main(String[] args) {

        int i;
        int[] numArr = {11,14,2,7,36,35};
        int[] copyArr = new int[numArr.length+1];


        for (i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i]; // copyArr에 numArr을 deep copy

        }
        copyArr[numArr.length] = 100;

      // copyArr[6] = 100;


        for (i = 0; i < numArr.length + 1 ; i++) {
            System.out.println(copyArr[i]);

        }



    }
}

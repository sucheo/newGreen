package com.green.java.ch05;

import java.util.Arrays;

//1.번호를 랜덤한 숫자로 하나 뽑는다.
//2. 중복된 숫자가 나오면 안된다.
//3. 7개를 뽑는다.
public class ArrayQuiz13 {
    static int num =45;
    static int[] temp = new int[6];
    public static void main(String[] args) {

        int[] lottoArr = new int[6];
        setRandomValuArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
    }

    static void setRandomValuArr(int[] lottoArr) {

        for (int i = 0; i < lottoArr.length; i++) {
            lottoArr[i] = (int)(Math.random()*num)+1;
            for (int j = 0; j <temp.length ; j++) {
                temp[i] = lottoArr[i];
            }
        }
        Arrays.toString(lottoArr);

    }
}

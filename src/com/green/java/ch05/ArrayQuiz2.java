package com.green.java.ch05;


// rNumArr은 6칸을 가지고 있는 정수형 배열입니다
//각 칸에 랜덤한 숫자 1~45사이의 값을 모두 넣어주세요
//

public class ArrayQuiz2 {
    public static void main(String[] args) {

        // Math.random()// 랜덤한 값 생성용
        int[] rNumArr = new int[6];

        for (int i = 0; i < rNumArr.length; i++) {
            rNumArr[i] = (int)(Math.random() * 45)+1 ;
        }
        for (int i = 0; i < rNumArr.length; i++) {
            System.out.printf("rNumArr[%d]의 값은 : %d 입니다. \n", i, rNumArr[i]);


        }



    }
}

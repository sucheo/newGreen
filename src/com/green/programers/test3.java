package com.green.programers;
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
public class test3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        double answer = 0;
        double temp;

        for (int i = 0; i < numbers.length; i++) {
                answer += numbers[i];

        }
        temp = answer/numbers.length;
        System.out.println(temp);
    }
}

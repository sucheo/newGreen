package com.green.java.ch04test;

import java.util.Scanner;
//2.while문사용해서 입력문 사용후 각자리 수의 합
public class WhileTest413_1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();

        while (num>0){
            System.out.printf("입력값%s은?",num);
        sum = sum+(num%10);
        num = num/10;

            System.out.printf("합계는%s",sum);
            System.out.println();
        }

}
    }


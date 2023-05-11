package com.green.selftest;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int input = sc.nextInt();
        System.out.print("숫자 입력 : ");
        int input2 = sc.nextInt();

        int min = input, max = input2;
        if(min>max){
            min = input2;
            max = input;
        }
        int sum = min;
        System.out.print(min);
        for (int i = min +1; i <=max; i++) {
            sum += i;
            System.out.printf(", %d",i);
        }
        System.out.println();
        System.out.printf("합계 : %d\n",sum);


    }
}
package com.green.java.ch04test;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        double num;
        double sum = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");

        while (flag) {
            System.out.print(">>");

            num =sc.nextDouble();


            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
            System.out.println("합계:" + sum);
        }
    }
}
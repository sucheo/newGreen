package com.green.java.ch06;

import java.util.Scanner;

// 각 자리 수의 합 구하기

public class FlowEx25Method_1 {
    public static void main(String[] args) {

        System.out.print("숫자를 입력하세요. (예:12345) > ");
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int sum = sumStringNumber(temp);
        System.out.printf("각 자리수의 합 : %d\n", sum);
    }

    public static int sumStringNumber(String str) {
        int val = Integer.parseInt(str);
        int sum = 0;
        while (val > 0) {
            sum += val % 10;
            val = val / 10;
        }
        return sum;
    }
}


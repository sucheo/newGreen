package com.green.java.ch04test;

import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {
        int num = 0, sum =0;
        System.out.println("숫자를 입력하세요ㅗ .(예:12345)>");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        num = Integer.parseInt(input);

        while(num!=0) {

            sum += num % 10;//sum 의 값은 num의 값을 10으로 나눈 나머지

            System.out.printf("sum=%3d num=%d%n", sum, num);
            num /= 10;
        }
        System.out.println("각 자리수의 합: " +sum);
    }

}

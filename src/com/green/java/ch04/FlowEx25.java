package com.green.java.ch04;

import java.util.Scanner;

// 각 자리 수의 합 구하기

public class FlowEx25 {
    public static void main(String[] args) {


        int num = 0, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) > ");

        String temp = scan.nextLine();
        num = Integer.parseInt(temp); // 입력받은 temp값 int로 형변환하여 num에 할당


        while(num!=0) { // num이 0이 될 때까지 > 0 이면 루프 바깥으로 나감
            sum += (num % 10); // sum은 num의 1의 자릿수를 더한다
            num = num/10; // num / 10 > 자릿수 하나씩 버림 > ex 123 > 12 > 1
        }

        System.out.println("각 자리수의 합은 "+sum);


    }
}


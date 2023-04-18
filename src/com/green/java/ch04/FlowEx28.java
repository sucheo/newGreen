package com.green.java.ch04;

import java.util.Scanner;


public class FlowEx28 {
    public static void main(String[] args) {
        int input, answer;
        answer = (int)(Math.random() * 100) + 1; //
        System.out.println(answer);

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print(" 1에서 100사이의 정수를 입력: ");
            String temp = scan.nextLine(); // 랜덤값 출력
            input = Integer.parseInt(temp);
            if (input < answer)
            {
                System.out.println("up");
            } else if (input > answer)
            {
                System.out.println("down");
            }
        }while(input != answer);
        System.out.print("good");
    }
}
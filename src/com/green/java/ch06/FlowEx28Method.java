package com.green.java.ch06;

import java.util.Scanner;


public class FlowEx28Method {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = getRandomNumber(1, 100);
        System.out.println(answer);//3,5 3,4,5

        do {
            System.out.print(" 1에서 100사이의 정수를 입력: ");
            input = scan.nextInt(); // 랜덤값 출력

            if (input < answer) {
                System.out.println("up");
            } else if (input > answer) {
                System.out.println("down");
            }
        } while (input != answer);
        System.out.print("good");
    }

    public static int getRandomNumber(int num1,int num2) {

        int answer = (int)(Math.random() * (num2-num1+1)) + num1;//1 , 100

        return answer;
    }

}
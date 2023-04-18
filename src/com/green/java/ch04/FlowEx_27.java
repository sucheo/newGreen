package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx_27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("합계를 구할 숫자를 입력하세요 (끝내려면 0)\n>>");

        while (true) {
            String input = sc.nextLine();
            num = Integer.parseInt(input);
            System.out.print(">>");
            sum = sum + num;

            if (num == 0) {

                System.out.printf("합계:%d", sum);
                break;
                }
            }
        }

    }

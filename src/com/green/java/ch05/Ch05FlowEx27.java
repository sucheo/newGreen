package com.green.java.ch05;

import java.util.Scanner;
//스프링김영한강의 노드 실무 ,노션 정리,개인 프로젝트
public class Ch05FlowEx27 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0)>>");
            String input = sc.nextLine();
            num = Integer.parseInt(input);
            sum += num;

            if (num == 0) {

                System.out.printf("합계 : %d", sum);
                break;
            }
        }
    }
}


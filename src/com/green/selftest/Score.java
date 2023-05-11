package com.green.selftest;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요");
        int idx = 0;
        int sum = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int num= Integer.parseInt(input);
            if(num == 0){
                System.out.printf("합게는 %s입니다. 평균은 %s입니다.",sum,sum/idx);
                break;
            }
            else if (num != 0) {
                System.out.println("정수를 입력하세요");
                sum += num;
                idx++;
            }
        }
    }
}

package com.green.javasub;

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("숫자를 입력하세요 (종료:0) > ");
            String input = sc.nextLine();
            num = Integer.parseInt(input);
            if(num == 0){
        break;
            }else if(num>0){
                sum=num+sum;
            }
        }System.out.printf("합계 : %s" ,sum);
    }
}
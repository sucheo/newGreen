package com.green.greenhome;

import java.util.Scanner;

public class calculrator {

    public static void main(String[] args) {
        int num ;
        int sum =0;
        int i = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("정수를입력하세요: ");
            String input = sc.nextLine();
            num = Integer.parseInt(input);
            sum += num;
            if(num == 0) {
                System.out.printf("합계는 %s입니다.평균은 %s입니다",sum,sum/i);
                break;
            }
            ++i;
        }
    }
}

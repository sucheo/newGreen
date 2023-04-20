package com.green.java.ch06;

import java.util.Scanner;

// 각 자리 수의 합 구하기

public class FlowEx25Method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) > ");
        String temp = sc.nextLine();
        int sum = Integer.parseInt(temp);
        //int sum = sumStringNumber(temp);
        sumStringNumber(sum);

        }
        public static void sumStringNumber(int temp){
        int num = 0;
        int sum = 0;
        while(temp != 0){
            num = temp%10; //1234 num = 4
            sum = num +sum; // 4+ 0 = 4
            temp = temp/10;// 1234/10 = 123.4 =temp

            }   System.out.println(sum);
}
    }




package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요. > ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        // Integer.parseInt 메소드를 이용해서 변환

        System.out.println("입력내용 :"+input);
        System.out.printf("num = %d ", num);
    }
    // 객체지향 언어는 수정이 어렵다
}
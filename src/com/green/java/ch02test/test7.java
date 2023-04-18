package com.green.java.ch02test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "성수천";


        System.out.println("나이를 입력하세요");


        String scan = sc.nextLine();
       int age = Integer.parseInt(scan);

    //문자를 숫자로 변환 String -> Int 함수 사용

        System.out.println("제이름은 " + name + "이고 나이는 " + age +"살 입니다.");
    }
}
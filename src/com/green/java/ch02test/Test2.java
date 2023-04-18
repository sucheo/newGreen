package com.green.java.ch02test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "성수천";
        System.out.println("나이를 입력하세요");

        String Input =sc.nextLine();
        int age = Integer.parseInt(Input);

        System.out.println("제 나이는" +age+"이고 이름은 "+ name +"입니다.");

    }
}

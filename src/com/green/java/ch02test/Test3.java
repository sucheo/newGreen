package com.green.java.ch02test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "성수천";
        System.out.println("나이를 입력하세요");

        String input = scan.nextLine();
        int age = Integer.parseInt(input);



        System.out.println("제 나이는" +age+" 살이고 이름은"+name+"입니다.");


    }

}

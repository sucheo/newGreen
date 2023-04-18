package com.green.java.ch02test;

import java.util.Scanner;

public class ifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력");
        System.out.print("점수를 입력해주세요");
        int number = sc.nextInt();

        if(number >=90){
            System.out.println("A입니다");
        }else if(number >=80 ){
            System.out.println("B입니다");
        } else if ( number >=70) {
            System.out.println("C입니다.");
        }else{
            System.out.println("F입니다.");
        }

    }
}
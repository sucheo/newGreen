package com.green.java.ch04;

/*

(1) saure
(2) squre root
(3) log
원하는 메뉴 1-3을 선택하세요 (종료:0) > 4
메뉴를 잘못 선택하셨습니다. (종료:0)
(1) saure
(2) squre root
(3) log
원하는 메뉴 1-3을 선택하세요 (종료:0) > 2
선택하신 메뉴는 2번입니다
(1) saure
(2) squre root
(3) log
원하는 메뉴 1-3을 선택하세요 (종료:0) > 0
프로그램을 종료합니다



 */


import java.util.Scanner;

public class flowex32 {
    public static void main(String[] args) {

        int input_num;

        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("(1) saure\n" +
                    "(2) squre root\n" +
                    "(3) log");
            System.out.print("원하는 메뉴 1-3을 선택하세요 (종료:0) > ");
           // String temp = scan.nextLine();
           // input_num = Integer.parseInt(temp);
            input_num = scan.nextInt();
            if(input_num == 0) {
                break;
            }
            else if (input_num < 3 && input_num > 0) {
                System.out.println("선택하신 메뉴는" + input_num + "번입니다");
            }
            else {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료:0) > ");
            }
        }
        System.out.println("프로그램을 종료합니다");



    }
}
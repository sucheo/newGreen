package com.green.java.ch06;

import java.util.Scanner;

//메소드 호출을 통한 입력받은 정수의 값을 표현해야함
//1. 메소드 호출문(변수) 선언
//2. 호출문(변수)의 이름에 따라 조건에 맞춰 작성
public class FlowEx18Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        gugudan(num);
        gugudan(9);
        gugudanall(9);
        gugudan(2,8);
        gugudan(5,7);
    }

    public static void gugudan(int sDan, int eDan){
        for (int i = sDan; i <=eDan ; i++) {
            gugudan(i);
            }

        }

    public static void gugudan(int dan) {
        for (int j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", dan, j, dan * j);
        }
        System.out.println();
    }

    public static void gugudanall(int dan) {
        for (int i = 2; i < 10; i++) {
            gugudan(i);
        }
    }


}
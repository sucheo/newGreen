package com.green.java.ch04test;

import java.util.Scanner;

public class GenderTest2 {

    public static void main(String[] args) {

        final int RG_W = 158;
        final int RG_M = 171;
        Scanner sc = new Scanner(System.in);

        System.out.println("성별을 입력하세요");
        String gender = sc.nextLine();
        System.out.println("키를 입력하세요");
        int num = sc.nextInt();
        int string = 0;
        if(gender.equals("M")){

        }else if(gender.equals("W")){

        }
        if(string>RG_W){
            System.out.println("평균 키 초과입니다");
        }else if(string<RG_W){
            System.out.println("평균 키 미만입니다.");
        }
        System.out.printf("입력한 성별과 %s키는 %s입니다.",gender,num);



    }

}

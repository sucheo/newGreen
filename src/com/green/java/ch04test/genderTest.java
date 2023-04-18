package com.green.java.ch04test;

import java.util.Scanner;

public class genderTest {
    public static void main(String[] args) {
        final int AR_W = 158;
        final int AR_M = 171;
        int stand = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("성별을 입력하세요");
        String gender = sc.nextLine();
        System.out.println("키를 입력하세요");
        int num =sc.nextInt();

//        if(gender.equals("W")){
//           if(num == AR_W){
//               System.out.println("평균키입니다.");
//            }else if(num >= AR_W){
//               System.out.println("평균키보다 큽니다.");
//           }else if(num <= AR_W){
//               System.out.println("평균키보다 작습니다.");
//           }
//
//        }


//        else if(gender.equals("M")){
//            if(num == AR_M){
//                System.out.println("평균키입니다.");
//            }else if(num >= AR_M){
//                System.out.println("평균키보다 큽니다.");
//            }else if(num <= AR_M){
//                System.out.println("평균키보다 작습니다.");
//            }

   if(gender.equals("W")){
            stand = AR_W;
        }else if(gender.equals("M")){
            stand = AR_M;
        }
        if(num > stand){
            System.out.println("평균초과입니다.");
        }else if(num < stand){
            System.out.println("평균미만입니다.");
        }else {
            System.out.println("평균입니다.");
        }
    }
}

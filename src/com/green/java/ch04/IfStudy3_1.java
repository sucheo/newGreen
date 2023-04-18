package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3_1 {
    public static void main(String[] args) {

        final int WOMAN_STAND = 158;
        final int MAN_STAND = 171;

        final int ERROR = -1;

        int stand = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("성별 입력 (w, m) : ");
        String gender = scan.nextLine();
        System.out.print("키 입력 : \n");
        int height = scan.nextInt();

        if(gender.equals("m")){
            stand = MAN_STAND;
        }
        else if(gender.equals("w")){
            stand = WOMAN_STAND;
        }
        else {
            height = ERROR;
        }

        if(height == stand){
            System.out.println("평균키입니다.");
        }
        else if(height > stand){
            System.out.println("평균키 초과입니다.");
        }
        else if(height > 0){
            System.out.println("평균키 미만입니다.");
        }
        else {
            System.out.println("입력값 오류입니다.");
        }



    }
}
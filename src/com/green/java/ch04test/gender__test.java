package com.green.java.ch04test;

import java.util.Scanner;

public class gender__test {
    public static void main(String[] args) {
        final int MAN_HEIGHT_STAND = 171;
        final int WOMAN_HEIGHT_STAND = 158;
        Scanner sc = new Scanner(System.in);
        System.out.println("성별을 입력해주세요");
       String gender = sc.nextLine();
        System.out.println("키를 입력해주세요");
        int height = sc.nextInt();
        int stand = 0;

        if(gender.equals("w")){
        stand = WOMAN_HEIGHT_STAND;
        } else if (gender.equals("m")) {
            stand = MAN_HEIGHT_STAND;
        }
        if(height>=stand){
            System.out.println("평균이상");
        }else if(height<=stand){
            System.out.println("평균이하");
        }else if(height==stand){
            System.out.println("평균");
    }
        }
        }


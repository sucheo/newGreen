package com.green.java.ch04test;

import java.util.Scanner;

public class genderTest_ {
        public static void main(String[] args) {
            final int WOMAN_HEIGHT_STAND = 158;
            final int MAN_HEIGHT_STAND = 171;


            Scanner sc = new Scanner(System.in);
            System.out.println("성별 입력 (W or M)");
            String gender = sc.nextLine();
            if (!gender.equals("M") && !gender.equals("W")) {
                System.out.println("잘못 입력하셨습니다.");

            } else {
                System.out.println("키 입력(cm): ");
                int height = sc.nextInt();
                if (gender.equals("M") && height == MAN_HEIGHT_STAND) {
                    System.out.printf("선택한 성별은 %s이고 키는 %s입니다. 평균키입니다.", gender, height);
                } else if (gender.equals("M") && height <= MAN_HEIGHT_STAND) {
                    System.out.printf("선택한 성별은 %s이고 키는 %s입니다. 평균미만키입니다.", gender, height);
                } else if (gender.equals("M") && height >= MAN_HEIGHT_STAND) {
                    System.out.printf("선택한 성별은 %s이고 키는 %s입니다. 평균이상의키입니다.", gender, height);
                }
                if (gender.equals("W") && height == WOMAN_HEIGHT_STAND) {
                    System.out.printf("선택한 성별은 %s이고 키는 %s입니다. 평균키입니다.", gender, height);
                } else if (gender.equals("W") && height <= WOMAN_HEIGHT_STAND) {
                    System.out.printf("선택한 성별은 %s이고 키는 %s입니다. 평균미만키입니다.", gender, height);
                } else if (gender.equals("W") && height >= WOMAN_HEIGHT_STAND) {
                    System.out.printf("선택한 성별은 %s이고 키는 %s입니다. 평균이상의키입니다.", gender, height);
                }

            }
        }
    }
//m, 171 평균값> 평균입니다.
//m, 172 초과값 > 평균 초과.
//m, 170 이하값 > 평균 미만

//w, 158 평균값> 평균입니다.
//w, 158 초과값 > 평균 초과.
//w, 158 미만값 > 평균 미만

//        if (gender.equals("M")&& height == MAN_HEIGHT_STAND) {
//            System.out.println("평균 키입니다.");
//        }
//        else if (gender.equals("M") && height > MAN_HEIGHT_STAND) {
//            System.out.println("평균초과한 키입니다.");
//        }else if (gender.equals("M") && height < MAN_HEIGHT_STAND) {
//            System.out.println("평균미만 키입니다.");
//        }
//        if (gender.equals("W")&& height == WOMAN_HEIGHT_STAND) {
//            System.out.println("평균 키입니다.");
//        }
//        if (gender.equals("W") && height > WOMAN_HEIGHT_STAND) {
//            System.out.println("평균초과한 키입니다.");
//        }else if (gender.equals("W") && height < WOMAN_HEIGHT_STAND) {
//            System.out.println("평균미만 키입니다.");
//        }

package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {

        System.out.println("현재 월을 입력하세요. (1-12)");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        String season = "";

        // num값이 345 봄
        // 678 여름
        // 9 10 11 가을
        // 12 1 2 겨울

        switch (mon) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                break;
        }
        if("".equals(season)){
            System.out.println("입력값 오류");
        }
        else {
            System.out.println("현재의 계절은 "+season+" 입니다");
        }
    }
}

// 빈칸 값 비교는 빈칸부터 적고 .equals로 비교하는 쪽이 안전하다
// if("".equals(season)) 예시
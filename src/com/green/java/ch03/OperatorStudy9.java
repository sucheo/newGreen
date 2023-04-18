package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        int num = scan.nextInt();
        System.out.println(" num : " + num);

        //num값 홀짝 구분 삼항식

        System.out.println(num + "(은/는)" + (num % 2 == 0 ? "짝수" : "홀수"));
        // 위 연산에서 String 타입과 만나 자동 형변환됨

    }
}



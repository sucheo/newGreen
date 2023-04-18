package com.green.java.Test;

import java.util.Scanner;

/*
입력받은 모든 방의 값을 더해서 출력해 주세요
 */
public class ArrayQuiz4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            sum = sum + numArr[i];
            System.out.println("더하실 값을 적어주세요 (0을입력하시면 종료합니다)");
            if (numArr[i] == 0) {
                break;
            }
        }
        System.out.print(sum);
    }
}

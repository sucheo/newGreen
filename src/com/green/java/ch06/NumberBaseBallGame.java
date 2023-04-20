package com.green.java.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {

    static int getRandomNumberArr2(int num1, int num2) {
        int answer = (int) (Math.random() * (num2 - num1 + 1)) + num1;
        return answer;
    }

    static int[] getRandomNumberArr(int numberCount) {
        int[] arr = new int[numberCount];
        int selectedIdx = 0;
        Loop:
        while (selectedIdx < arr.length) {
            int rVall = getRandomNumberArr2(1, 9);

            for (int i = 0; i < selectedIdx; i++) {
                if (arr[i] == rVall) {
                    continue Loop;
                }
            }
            arr[selectedIdx++] = rVall;
        }
        return arr;
    }
   public static void main(String[] args) {
        final int NUMBER_COUNT = 3;
        int[] numArr = getRandomNumberArr(NUMBER_COUNT);
        System.out.println(Arrays.toString(numArr));

        Scanner sc = new Scanner(System.in);
        System.out.printf("[Game Start]");

        int count =0;
        while (true) {

            int[] myArr = new int[NUMBER_COUNT];
            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.printf("\n%s번 숫자 입력", i + 1);
                myArr[i] = sc.nextInt();
                ++count;
            }

            int s = 0, b = 0, o = 0 ;
            for (int i = 0; i < NUMBER_COUNT; i++) {

                for (int z = 0; z < NUMBER_COUNT; z++) {
                    if (numArr[i] == myArr[z]) {
                        if (i == z) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            o = NUMBER_COUNT - (s + b);
            System.out.printf("S: %d, B:%d, O:%d\n", s, b, o);

            if(s == NUMBER_COUNT){
                System.out.printf("%s번만에 맞추셨습니다.",count/3);
                break;
            }
        }
    }
}
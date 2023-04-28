package com.green.javasub;

public class ForQuiz2 {
    public static void main(String[] args) {
        int star = 5;
        final int ROW_CNT = 5;
        int max = star *star;
        //25번 반복되는 for문 작성
        //***
        for (int i = 1; i < 26; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("==============================");
        for (int i = 0; i < max; i++) {
            if(i % ROW_CNT == 0){
                System.out.println();
            }
            System.out.print("*");
        }
        System.out.println();
        System.out.println("==============================");
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("==============================");

    }
}

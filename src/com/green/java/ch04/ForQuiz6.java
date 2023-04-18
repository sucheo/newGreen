package com.green.java.ch04;

public class ForQuiz6 {
    public static void main(String[] args) {

        // 2*1 = 2 .... 9*1 = 9
        // 2*2 = 4  3*2 = 6     ... 9*2 = 18

        // 2*9 = 18 .............. 9*9 = 81

        int gugudan = 0;

        for (gugudan = 1; gugudan <= 9; gugudan++) {
            for(int i=2; i<=9; i++) {
                System.out.printf("%d * %d = %d \t │ \t", i , gugudan, gugudan * i);
            }
            System.out.println();
        }


    }
}


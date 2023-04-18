package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {

        int star = 5;


        /*
        *
       **
      ***
     ****
    *****/

        /*
        for (int i = 1; i <= star; i++) {
            for (int j = 0; j < star - i; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if(i != star) System.out.println();
        }*/

        // 피라미드 (삼각형)

/*
        int prmd = 10;
        for (int i = 1; i <= prmd; i++) {
            for (int j = 1; j <= prmd-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

*/
        // 모래시계
/*
        int morae = 10;


        for(int i2 = morae; i2 >= 0; i2--) {
            for (int j = 1; j <= morae - i2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i2 * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= morae; i++) {
            for (int j = 1; j <= morae - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

*/

        //다이아몬드

        int dia = 11;

        for(int i = 1; i <= dia; i++) {
            for (int j = 1; j <= dia - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i2 = dia-1; i2 >= 0; i2--) {
            for (int j = 1; j <= (dia - i2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i2 * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


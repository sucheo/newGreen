package com.green.java.ch02;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int temp = 0;

        System.out.printf("x : %d y : %d\n", x,y);

        temp = x;
        x = y;
        y = temp;

       // System.out.printf("x : %d y : %d tmp : %d \n\n\n\n", x,y,temp);

        System.out.printf("x : %d y : %d\n", x,y);
    }
}

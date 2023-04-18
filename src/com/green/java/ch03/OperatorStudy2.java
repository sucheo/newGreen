package com.green.java.ch03;

public class OperatorStudy2 {
    public static void main(String[] args) {

        int num = 10;

        int result = num % 2;
        System.out.printf("%d %% 2 = %d\n", num, result);


        num = 9;

        result = num % 2;
        System.out.printf("%d %% 2 = %d\n", num, result);

        if(result == 1) System.out.println(num + "값은 홀수");
        else System.out.println(num + "값은 짝수");


    }
}

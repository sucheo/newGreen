package com.green.java.ch04;

public class FlowEx18 {
    public static void main(String[] args) {

        //중첩 for문을 이용하여 2단부터 9단 구구단을 출력
        // 단수가 바뀌면 개행+1

        int gugudan = 2;

        for (gugudan = 1; gugudan <= 9; gugudan++) {

            for(int i=1; i<=9; i++) {
                System.out.printf("%d * %d = %d \n", gugudan , i, gugudan * i);
            }
            System.out.println();

        }
    }
}

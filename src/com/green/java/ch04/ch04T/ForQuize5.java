package com.green.java.ch04.ch04T;

import java.util.Scanner;

public class ForQuize5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int gugudan = Integer.parseInt(input);

for(int j = 2; j<10; j++){
    for (int i = 1; i <10; i++){
        System.out.printf("%d * %d = %d",gugudan,i,gugudan*i);
        System.out.println();
    }

}


        }

        }
package com.green.java.ch04test;

import java.util.Scanner;

public class ifex {
    public static void main(String[] args) {
        String grade = " ";
        String org = " ";

        System.out.println("성적을입력하세요");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int score = Integer.parseInt(input);

        if (score > 90) {
            grade = "A";

            if (score > 97) {
                org = "+";
            } else if (score > 94) {
                org = "-";
            }
        }
          else if (score >= 80) {
            grade = "B";

            if (score > 86) {
                org = "+";
            } else if (score > 82) {
                org = "-";
            }
        }
           else {
               grade = "C";
           }
        System.out.printf("당신의성적은 %s%s입니다.", grade, org);
    }
}
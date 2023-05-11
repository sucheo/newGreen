package com.green.selftest;

public class Grade {
    public static void main(String[] args) {
        new Grade("강백호",90.0,85.5,70.0);
        new Grade("채치수",82.0,92.0,60.5);

    }
    public Grade(String name , double k1, double e1, double m1) {
            double avg= (k1+e1+m1)/3;
                System.out.printf("%s의 평균점수 : %.5s",name,avg);
        }
}


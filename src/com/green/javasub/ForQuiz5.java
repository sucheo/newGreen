package com.green.javasub;

public class ForQuiz5 {
    public static void main(String[] args) {
        int dan = 6;
        printGugudan(dan);
    int sDan = 2, eDan = 8;
    printGugudan(sDan,eDan);
    }

    static void printGugudan(int dan) {
        for (int i =1 ; i < 10; i++) {
            System.out.printf("%s * %s = %s\n",dan,i,i*dan);
        }

    }
    static void printGugudan(int sDan, int eDan){
        for (int i = sDan; i <= eDan; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.printf("%s * %s = %s\n",i,j,i*j);

            }
        }
    }

}

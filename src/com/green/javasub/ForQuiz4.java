package com.green.javasub;

public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;
        for (int i = 0; i < star; i++) {
            for (int j = star; j > i; j--) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
}

package com.green.javasub;

public class ForQuiz3 {
    public static void main(String[] args) {
        int star = 5;

        for (int i = 1; i <= star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*
        //**
        //***
        //****
        //*****
    }
}

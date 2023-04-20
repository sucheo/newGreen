package com.green.java.ch06;

public class FlowEx17Method {

    public static void main(String[] args) {
        int star = 5;

        printStarLine(star);
        printStarLine(3);

        printStarRect(3);
        printStarRect(4);

        printStarTri(4);
        //***
        //***
        //***
    }


    public static void printStarLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarRect(int star){
        System.out.println();
        for(int i =0; i<star;  i++){
           printStarLine(star);
        }
    } public static void printStarTri(int star){

        for (int i = 0; i <= star; i++) {
            printStarLine(i);
            }
            System.out.println();
        }
    }

//*
//**
//***
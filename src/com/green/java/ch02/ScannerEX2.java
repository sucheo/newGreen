package com.green.java.ch02;
import java.util.Scanner;

public class ScannerEX2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

/*
        System.out.print("나이 입력 : \n");
        String ageinput = scan.nextLine();
        int age = Integer.parseInt(ageinput);

        System.out.printf("나의 이름은 김다율이고 나이는 %d 입니다.", age);


        */
        String Name;


        System.out.print("이름 입력 : \n");
        String NameInput = scan.nextLine();
        System.out.print("나이 입력 : \n");
        String AgeInput = scan.nextLine();
        Name = NameInput;
        int age = Integer.parseInt(AgeInput);

        System.out.printf("나의 이름은 %s이고 나이는 %d 입니다.", Name, age);


        // 나의 이름은 김다율이고 나이는 nn살 입니다.

    }
}

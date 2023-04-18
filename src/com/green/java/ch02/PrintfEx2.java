package com.green.java.ch02;

public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        String finger = "가나";
        float f1 = .10f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g\n",f1,f1,f1);
        System.out.printf("d=%\n" ,d);
        System.out.printf("d=%14.10f\n",d);
        System.out.printf("d=%.3f\n",d);

        System.out.println("[12345678901234567890]\n");
        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%.8s]\n", url);
        System.out.printf("[%5s]\n", finger);
    }

}

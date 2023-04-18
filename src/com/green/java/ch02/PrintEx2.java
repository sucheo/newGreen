package com.green.java.ch02;

public class PrintEx2 {
    public static void main(String[] args){
        String url = "www.codechobo.com";
        float f1 = .01f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g\n", f1, f1, f1);
        System.out.printf("d=%f \n",d);
        System.out.printf("d=%.3f\n", d);

        System.out.printf("s=%s\n", url);
        System.out.printf("s=%20s\n", url);
        System.out.printf("s=%-20s\n", url);
        System.out.printf("s=%.8s\n", url);



    }


}


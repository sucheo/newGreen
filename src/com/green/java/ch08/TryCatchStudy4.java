package com.green.java.ch08;

public class TryCatchStudy4 {
    public static void main(String[] args) {
        int type = 1;
        try {
            System.out.println("ddd");
            if (type == 0) {
                throw new Exception("고의로 예외발생");
            }
        else if (type == 1) {
            throw new ArithmeticException("숫자 예외 발생");
        }
    }
        catch (Exception e){
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }finally {

        }
        System.out.println("끝!");
    }
}

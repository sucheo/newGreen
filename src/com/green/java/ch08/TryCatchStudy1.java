package com.green.java.ch08;

public class TryCatchStudy1 {
    public static void main(String[] args) {
        
        try{
            int result = 10/1;
            System.out.println("다음줄");
            //예외가 발생될 가능성이 있는 로직(소스) 위치
        }catch (Exception e1){
            e1.printStackTrace();//에러 확인가능
            System.out.println("잘못 입력");
            //예외가 발생되었을 때 하고 싶은 작업(로직) 위치
        }finally {
            System.out.println("Finally");
            //옵션, 예외가 발생이 되던 안되던 실행하고 싶은 로직 위치
        }
        System.out.println("끝");
    }
}

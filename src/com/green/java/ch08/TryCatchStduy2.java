package com.green.java.ch08;

public class TryCatchStduy2 {
    public static void main(String[] args) {
        String str = "123a";
        try {
            int r1 = 10/0;
            int num = Integer.parseInt(str);
            System.out.println("num : " + num);
        } catch (NumberFormatException e){
            System.out.println("넘버포멧 예외 발생");
    }catch(ArithmeticException e){
            System.out.println("숫자 예외 발생");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("예외 발생");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("끝");
    }
}
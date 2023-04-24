package com.green.java.ch06;

public class TvTest5 {

    static String brand;

    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        tv1.color = "black";
        tv2.color = "red";

        tv1.brand = "현대";
        tv2.brand = "기아";
        Tv.brand = "폭스바겐"; // 클래스명으로 접근하거나 객체명으로 접근해도 값은 하나 밖에없음 ㅇㅋ?
        TvTest5.brand = "볼보";

        System.out.println("tv1.color = " + tv1.color);
        System.out.println("tv2.color = " + tv2.color);

        System.out.println("tv1.brand = " + tv1.brand);
        System.out.println("tv2.brand = " + tv2.brand);
        System.out.println("TvTest5.brand = " + TvTest5.brand);
    }
}

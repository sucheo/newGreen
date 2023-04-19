package com.green.java.ch06;

public class TvTest4 {
    public static void main(String[] args) {
     Tv[] tvArr = new Tv[3];//Tv객체의 주소값
//        Tv tv1,tv2,tv3;
        String[] strArr = new String[3];
     for(int i =0; i< tvArr.length; i++){
//        tvArr[i] = new Tv();
//        tvArr[i].channel = 10+i; 
//         아래와같은거
    Tv tv = new Tv();
    tvArr[i] = tv;
    tv.channel = i +10;
     }
            tvArr[0].channel =0;
        System.out.println(tvArr[2].channel);
        System.out.println(tvArr[1].channel);

    }
}

package com.green.java.ch01;

public class DateTest2 {
    public static void main(String[] args) {
    String num;
        int y = 2023, m = 5, d= 27;

        String sMon = String.valueOf(m);
        if(m < 10){
            sMon = "0" + sMon;
        }
        String sDay = String.valueOf(d);

        if(d < 10){
            sDay = "0" + sDay;
        }
        System.out.printf("%s-%s-%s\n",y,sMon,sDay);

        m = 12;
        d = 5;
        sMon = (m < 10? "0" : "") + String.valueOf(m);
        sDay = (d < 10? "0" : "") + String.valueOf(d);
        System.out.printf("%s-%s-%s\n",y,sMon,sDay);

        System.out.printf("%s-%s-%s",y,convertTwoNumber(m),convertTwoNumber(d));
    }
public static String convertTwoNumber(int n){
        return (n <10 ? "0" : "") +n;
}
}

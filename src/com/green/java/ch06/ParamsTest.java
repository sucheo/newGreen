package com.green.java.ch06;

public class ParamsTest {
    public static void main(String[] args) {
        int num = 10;
//
        NumberBox nb = new NumberBox();
        nb.num = 10;
        NumberBox nb2 = new NumberBox();

        NumberBox nb3 = new NumberBox();
        NumberBox nb4 = changeNum4(nb3);
        System.out.println("nb.num : " + nb.num);
        System.out.println("nb2.num : " + nb2.num);
        System.out.println("nb3.num : " + nb3.num);
        System.out.println("nb4.num : " + nb4.num);
    }

    static void changeNum(int num) {
        num = 20;
    }

    static void changeNum2(NumberBox nb2) {
        nb2.num = 20;
    }

    static NumberBox changeNum4(NumberBox nb2){
        nb2 = new NumberBox();
        nb2.num = 30;
        return nb2;
    }
}
class NumberBox {
    int num;
}

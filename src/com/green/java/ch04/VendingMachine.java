package com.green.java.ch04;

import java.text.NumberFormat;

public class VendingMachine {
        int money =0;
    public void insert(int money){
        this.money += money;

    }
    public void showMoney(){
        System.out.printf("현재 잔액은 %,d 원입니다.\n",money);
    }

    public void object(){
        System.out.printf("선택하신 물건은 %d 입니다.");
    }

}

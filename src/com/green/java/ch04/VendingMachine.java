package com.green.java.ch04;

import java.text.NumberFormat;

public class VendingMachine {

    private String[] menu= {"콜라","사이다","환타","미란다"};
    private int price[] = {1000,1500,2000,2500};


        int money =0;
    public void insert(int money){
        this.money += money;
    }
    public void showMoney(){
        System.out.printf("현재 잔액은 %,d 원입니다.\n",money);
    }

    public void showMenus(){
        System.out.println("번호 \t 메뉴명 \t  가격");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+1+" \t\t " + menu[i]+ " \t " + price[i]+"원");
        }
        
        
    }

    public void purchaseDrink(int idx) {
        int num = idx-1;

        System.out.printf("%s를 구매하셨습니다.\n",menu[num]);
        money = money - price[num];

       }


    }


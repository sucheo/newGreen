package com.green.java.ch04.vendingmachine;

import java.util.LinkedList;

public class VendingMachine {

    private String[] menu= {"콜라","사이다","환타","미란다"};
    private int price[] = {1000,1500,2000,2500};
    private LinkedList<Integer> purchaseList = new LinkedList<>();//임의 배열 선언

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
        purchaseList.add(num);
       }
       public void showPurchaseList() {

    if(purchaseList.size() == 0){
        System.out.println("제품을 구매하지 않았습니다.");
        return;
    }
    int num = purchaseList.get(0);
           System.out.print(menu[num]);

           for (int i = 1; i < purchaseList.size(); i++) {
               num = purchaseList.get(i);
               System.out.printf(", %s",menu[num]);
           }
           System.out.println("을(를) 구매하였습니다.");
    }

}


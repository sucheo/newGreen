package com.green.java.ch04.vendingmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineObj {

   private int money ;
   private List<Drink> list;


   public VendingMachineObj(){
       list = new ArrayList<>();
       list.add(new Drink(1000,"콜라","코카콜라",500));
       list.add(new Drink(1500,"사이다","칠성",450));
       list.add(new Drink(2000,"환타","코카콜라",500));
   }
    public void insert(int money){
    this.money += money;

    }
    public void showMoney(){
        System.out.println("money : " + money);
    }
    public void showMenus(){
        System.out.println("번호 \t 메뉴명 \t 가격 \t 회사 \t 용량");

        int num =1;
        for (Drink d : list){
            System.out.printf("%d \t %s \t %,d원 \t %s \t %,dml",num++,d.getNm(),d.getPrice(),d.getCompany(),d.getMil());
            System.out.println();
            }

        }
    public void purchaseDrink(int idx){
       Drink d = list.get(idx - 1);
        System.out.printf("%s를 구매하였습니다.",d.getNm());
        money -= d.getPrice();
        System.out.println();

    }
    }

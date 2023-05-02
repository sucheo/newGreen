package com.green.java.ch04.vendingmachine;

public class Drink {
    private int price;
    private String nm;
    private String company;
    private int mil;

 public Drink(int price,String nm, String company, int mil){

     this.price = price;
     this.nm = nm;
     this.company = company;
     this.mil = mil;

    }

    public int getPrice() {
        return price;
    }

    public String getNm() {
        return nm;
    }

    public String getCompany() {
        return company;
    }

    public int getMil() {
        return mil;
    }
}

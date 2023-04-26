package com.green.java.ch07.poly;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv2 tv2 = new Tv2();
        Computer com = new Computer();
        Buyer buyer = new Buyer();
        buyer.buy(tv2); //Tv를 100만웬 구매하였습니다.
        buyer.buy(com); //Computer를 200만원에 구매하였습니다.
        
        buyer.printState(); // 나의 남은 돈 + 보너스 점수는 %,d점 입니다.
    }
}
class Buyer{
    private int money;
    private int bonusPoint;

    public Buyer(){
        this.money=1000;
        this.bonusPoint = 0;
    }
    public void buy(Product p) {
        int productPrice = p.getPrice();
        money = money - productPrice;
        bonusPoint = bonusPoint + p.bonusPoint;
        System.out.println(p.toString()+"을(를) "+p.price+"만원에 구매하였습니다.");
    }
    public void printState(){
        System.out.printf("나의 남은돈은 %,d만원입니다. 보너스 점수는 %,d점입니다.\n",money,bonusPoint);
    }
}

class Product{
    protected int price;
    protected int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price * 0.1);
    }

    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
}
class Tv2 extends Product{
    public Tv2(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer extends Product{
    public Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
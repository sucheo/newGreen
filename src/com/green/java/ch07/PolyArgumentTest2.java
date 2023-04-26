package com.green.java.ch07;


public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy3(new Tv3());
        b.buy3(new Computer3());
        b.buy3(new Audio3());
        b.buy3(new Audio3());
        b.summary();
        //구입하신 제품은 Tv,Computer,Audio, Audio 총 4개입니다.
    }
}
class Buyer3{
    private int money;
    private int bonusPoint;
    private Product3[] items;
    private int idx;

    public void summary(){
        System.out.print("구입하신 제품은 ");
        for (int i = 0; i < idx; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(items[i]);
        }
        System.out.println(" 총 " + idx+"개 입니다.");
}
    public Buyer3(){
        this.money=1000;
        this.bonusPoint = 0;
        this.items = new Product3[10];
        this.idx = 0;
        printState();
    }
    public void buy3(Product3 p) {
        items[idx++] = p;
        int productPrice = p.getPrice();
        money = money - productPrice;
        bonusPoint = bonusPoint + p.bonusPoint;


        System.out.println(p.toString()+"을(를) "+p.price+"만원에 구매하였습니다.");
    }
    public void printState(){
        System.out.printf("나의 남은돈은 %,d만원입니다. 보너스 점수는 %,d점입니다.\n",money,bonusPoint);
    }
}

class Product3{
    protected int price;
    protected int bonusPoint;

    Product3(int price){
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
class Tv3 extends Product3 {
    public Tv3(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}
class Computer3 extends Product3 {
    public Computer3(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}
class Audio3 extends Product3 {
    public Audio3() {super(50);}
    public String toString() {return "Audio";}
}

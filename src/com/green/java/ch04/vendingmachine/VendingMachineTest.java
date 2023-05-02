package com.green.java.ch04.vendingmachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vmt = new VendingMachine();

        vmt.insert(10000);
        vmt.insert(10000);
        vmt.insert(10000);
        vmt.insert(10000);

        vmt.showMenus();


        vmt.purchaseDrink(1);//콜라를 구매하였습니다. (money값은 -1000 처리)
        vmt.purchaseDrink(1);//콜라를 구매하였습니다. (money값은 -1000 처리)
        vmt.purchaseDrink(1);//콜라를 구매하였습니다. (money값은 -1000 처리)

        //vmt.object();
        vmt.showPurchaseList();
        vmt.showMoney();//현재 잔액은 30,000원 입니다.
    }


}

package com.green.java.ch04.vendingmachine;

public class VendingMachineObjTest {

    public static void main(String[] args) {
        VendingMachineObj vmo = new VendingMachineObj();
        vmo.insert(10_000);
        vmo.insert(10_000);
        vmo.insert(10_000);

        vmo.showMenus();
        vmo.purchaseDrink(1);
        vmo.purchaseDrink(2);


        vmo.showMoney();

    }
}

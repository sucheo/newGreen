package com.green.java.ch04;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vmt = new VendingMachine();
        vmt.insert(10000);
        vmt.insert(10000);
        vmt.insert(10000);
        vmt.insert(10000);
        vmt.showMoney();//현재 잔액은 30,000원 입니다.
        vmt.object();


    }


}

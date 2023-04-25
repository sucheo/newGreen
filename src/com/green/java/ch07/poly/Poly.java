package com.green.java.ch07.poly;
//p.354 다형성 (상속관계에서만 의미 있음)
public class Poly {
    /*
        1.부모타입은 자식 객체주소값 저장가능
        2.자식타입은 부모객체 주소값 저장불가능
        3.타입은(알고 있는 메소드만 호출할 수 있음)
            메소드를 호출 할 수 있나,없나만 결정 >
            실제 실행되는건 객체기준
     */
    public static void main(String[] args) {
    Animal ani1 = new Dog();
    ani1.crying();


    Dog dog1 = (Dog)ani1;
    dog1.crying();
    dog1.jump();

    }
}

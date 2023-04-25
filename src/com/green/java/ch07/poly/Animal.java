package com.green.java.ch07.poly;

public class Animal {
    private String name;
    public Animal() {}
    public Animal(String name){
        this.name = name;
    }

    public void crying() {
        System.out.println("동물이 운다.");
    }
}
class Dog extends Animal {
    public Dog(){
        super("바둑이");
    }

    public Dog(String name){
        super(name);
    }

    @Override    
    public void crying(){
        System.out.println("멍.");
}

    public void jump(){
        System.out.println("Jump");
    }
}


        class Bulldog extends Dog {
            @Override
            public void crying(){
                System.out.println("으르렁!!");
            }

        }

        class Cat extends Animal {
    public Cat(){
        super("고양이");
    }
            @Override
            public void crying(){
                System.out.println("야옹 야옹");
            }

        }

        class Duck extends Animal {

    public Duck(){
        super("오릐");
    }
            @Override
            public void crying(){
                System.out.println("꽥 꽥");
            }


        }

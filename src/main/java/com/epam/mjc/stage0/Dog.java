package com.epam.mjc.stage0;

public class Dog extends Animal{

    public static void main(String[] args) {
        new Dog().getDescription();
    }

    public Dog() {
        super("brown", 4, true);
    }
}

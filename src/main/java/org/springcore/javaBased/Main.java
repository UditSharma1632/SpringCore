package org.springcore.javaBased;

public class Main {
    public static void main(String[] args) {

   MiddleWare middleWare = new Cat();
    Animal animal = new Animal(middleWare);

    animal.makeSound();

    }
}
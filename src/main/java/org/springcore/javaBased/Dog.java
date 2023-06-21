package org.springcore.javaBased;

public class Dog implements MiddleWare{

    @Override
    public void sound(){
        System.out.println("Dog is Barking");
    }
}

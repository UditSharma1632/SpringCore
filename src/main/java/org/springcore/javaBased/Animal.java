package org.springcore.javaBased;

public class Animal {

    Dog dog;

    Cat cat;

    private MiddleWare middleWare;

//   public Animal(){
//       this.dog = new Dog();
//   }

//    public Animal(){
//        this.cat = new Cat();
//    }

    public Animal(MiddleWare middleWare){
        this.middleWare = middleWare;
    }

//   public void makeSound(){
//       this.dog.sound();
//   }
//    public void makeSound(){
//        this.cat.sound();
//    }

    public void makeSound(){
        this.middleWare.sound();
    }

}

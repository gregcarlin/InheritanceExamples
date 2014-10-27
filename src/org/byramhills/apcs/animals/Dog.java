package org.byramhills.apcs.animals;

public abstract class Dog extends Animal {
    public void pet() {
        System.out.println("woof woof");
    }
    
    public void feed(Food food) {
        if(food instanceof DogFood) {
            System.out.println("om nom nom");
        } else {
            System.out.println("ewww");
        }
    }
}

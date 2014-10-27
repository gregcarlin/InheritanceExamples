package org.byramhills.apcs.animals;

public class Bird extends Animal {
    public void pet() {
        System.out.println("squawk");
    }
    
    public void feed(Food food) {
        if(food instanceof BirdFood) {
            System.out.println("cheep cheep");
        } else {
            System.out.println("tasty");
        }
    }
}

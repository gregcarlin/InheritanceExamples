package org.byramhills.apcs.animals;

public class AnimalTester {
    public static void main(String[] args) {
        BirdFood birdFood = new BirdFood();
        
        Labrador max = new Labrador();
        max.pet();
        max.feed(birdFood);
        
        Goat jim = new Goat();
        jim.pet();
        jim.feed(birdFood);
    }
}

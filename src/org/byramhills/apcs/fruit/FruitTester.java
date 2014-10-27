package org.byramhills.apcs.fruit;

public class FruitTester {
    public static void main(String[] args) {
        GoldenDelicious brian = new GoldenDelicious();
        System.out.println(brian.isPeelable());
        
        PoisonBerry billy = new PoisonBerry();
        billy.eat();
    }
}

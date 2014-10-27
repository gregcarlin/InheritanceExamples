package org.byramhills.apcs.fruit;

import java.awt.Color;

public abstract class Fruit {
    /**
     * Is this fruit edible?
     */
    public boolean isEdible() {
        return true;
    }
    
    /**
     * What color is this fruit?
     */
    public abstract Color getColor();
    
    /**
     * Can I peel this fruit?
     */
    public abstract boolean isPeelable();
    
    /**
     * Eat this fruit.
     */
    public void eat() {
        if(isEdible()) {
            System.out.println("nom nom nom");
        } else {
            System.out.println("ouch!");
        }
    }
}

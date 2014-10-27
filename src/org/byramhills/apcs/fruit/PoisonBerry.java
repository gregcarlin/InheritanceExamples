package org.byramhills.apcs.fruit;

import java.awt.Color;

public class PoisonBerry extends Fruit {
    public boolean isEdible() {
        return false;
    }
    
    public Color getColor() {
        return Color.RED;
    }
    
    public boolean isPeelable() {
        return false;
    }
}

package org.byramhills.apcs.cars;

public abstract class Car {
	// Private Variables
	public int currentSpeed;
	public int maxSpeed;
	private String color;
	private boolean cool;

	// Constructors
	public Car() {

	}

	public Car(int currentSpeed1, int maxSpeed1, String color1, boolean cool1) {
		currentSpeed = currentSpeed1;
		maxSpeed = maxSpeed1;
		color = color1;
		cool = cool1;
	}

	public void drive() {
		if (currentSpeed < maxSpeed) {
			currentSpeed++;
		}
	}
}

package org.byramhills.apcs.cars;

public class Ferrari extends Car {
	// New Variables specific to ferrari
	private boolean loud;
	private String howFun;

	// Override Constructors
	public Ferrari() {
		super();
	}

	public Ferrari(boolean loud1, String howFun2, int currentSpeed1,
			int maxSpeed1, String color1, boolean cool1) {
		super(currentSpeed1, maxSpeed1, color1, cool1);
		loud = loud1;
		howFun = howFun2;
	}

	// Override the old drive to make it fast
	public void drive() {
		if (currentSpeed < maxSpeed) {
			currentSpeed += 100;
		}
	}

}

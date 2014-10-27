package org.byramhills.apcs.cars;

public class tester {

	public static void main(String[] args) {
		// Cant initiate abstract classes
		Car carlin = new Car();

		Ferrari brian = new Ferrari();
		Ferrari brian2 = new Ferrari(true, "very", 0, 250, "red", true);
		brian2.drive();

		AstonMartin lewick = new AstonMartin();
		AstonMartin lewick2 = new AstonMartin(true, 7, 0, 250, "green", true);
	}

}

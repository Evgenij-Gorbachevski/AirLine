package by.htp.model;

import java.util.Random;

public class PassengerPlane extends Plane {

	public PassengerPlane(String planeName) {
		Random rand = new Random();
		setPlaneName(planeName);
		setPlaneSpeed(rand.nextInt(1000));
		setPlaneCost(11000000);
		setFuelCapacity(rand.nextInt(10000));
		setRangeOfFlight(rand.nextInt(10000));
		setCountOfSeats(rand.nextInt(200));
		setCarrying(rand.nextInt(2500));
	}

}

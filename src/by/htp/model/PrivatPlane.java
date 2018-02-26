package by.htp.model;

import java.util.Random;

public class PrivatPlane extends Plane {

	public PrivatPlane(String planeName) {
		Random rand = new Random();
		setPlaneName(planeName);
		setPlaneSpeed(rand.nextInt(1000));
		setPlaneCost(999000);
		setFuelCapacity(rand.nextInt(3000));
		setRangeOfFlight(rand.nextInt(6000));
		setCountOfSeats(rand.nextInt(20));
		setCarrying(rand.nextInt(50));
	}

	
}

package by.htp.model;

import java.util.Random;

public class CargoPlane extends Plane {

	public CargoPlane(String planeName) {
		Random rand = new Random();
		setPlaneName(planeName);
		setPlaneSpeed(rand.nextInt(850));
		setPlaneCost(2000000);
		setFuelCapacity(rand.nextInt(15000));
		setRangeOfFlight(rand.nextInt(7000));
		setCountOfSeats(rand.nextInt(15));
		setCarrying(rand.nextInt(60000));
	}

}

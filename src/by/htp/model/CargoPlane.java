package by.htp.model;

import java.util.Random;

public class CargoPlane extends Plane{

	int carrying;
	
	public CargoPlane(String planeName) {
		Random rand = new Random();
		setPlaneName(planeName);
		setPlaneSpeed(rand.nextInt(850));
		setPlaneCost(2000000);
		setFuelCapacity(rand.nextInt(15000));
		setRangeOfFlight(rand.nextInt(7000));
		setCarrying(rand.nextInt(100));
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}
	
}

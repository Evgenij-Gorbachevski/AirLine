package by.htp.model;

public class Plane {

	private String planeName;
	private int planeSpeed;
	private int planeCost;
	private int rangeOfFlight;
	private int fuelCapacity;
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getPlaneSpeed() {
		return planeSpeed;
	}

	public void setPlaneSpeed(int planeSpeed) {
		this.planeSpeed = planeSpeed;
	}

	public int getPlaneCost() {
		return planeCost;
	}

	public void setPlaneCost(int planeCost) {
		this.planeCost = planeCost;
	}

	public int getRangeOfFlight() {
		return rangeOfFlight;
	}

	public void setRangeOfFlight(int rangeOfFlight) {
		this.rangeOfFlight = rangeOfFlight;
	}

}

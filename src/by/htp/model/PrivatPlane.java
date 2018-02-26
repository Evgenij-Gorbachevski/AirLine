package by.htp.model;

public class PrivatPlane extends Plane {
	
	public PrivatPlane(String planeName, int planeSpeed, int planeCost, int rangeOfFlight) {
		super(planeName, planeSpeed, planeCost, rangeOfFlight);
		// TODO Auto-generated constructor stub
	}
	
	public String planeName;
	public int planeSpeed;
	public int planeCost;
	public int rangeOfFlight;
	
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
		return super.planeCost;
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

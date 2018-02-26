package by.htp.model;

public class AirLine {

	private Plane[] planes;
	private int planeCount = 0;
	private int totalSeats = 0;
	private int totalCargo = 0;

	public void setPlanes(Plane[] planes) {
		this.planes = planes;
	}

	public Plane[] getPlanes() {
		return planes;
	}
	
	private void newPlane() {
		Plane[] plane = new Plane[planeCount + 1];
		for (int i = 0; i < this.planes.length - 1; i++) {
			planes[i] = this.planes[i];
		}
	}
	
	private void addNewPlane(Plane plane) {
		planes[planeCount] = plane;
		planeCount++;
	}
	
	public void addPlane(Plane plane) {
		if (planes != null) {
			if (planeCount < planes.length) {
				addNewPlane(plane);
			} else {
				newPlane();
				addNewPlane(plane);
			}
		} else {
			planes = new Plane[20];
			addNewPlane(plane);
		}
	}
	
	public void airLineInform() {
		if (planes != null) {
			for (Plane plane : planes) {
				if (plane != null) {
					System.out.println("Plane madel:           "+ plane.getPlaneName());
					System.out.println("Plane speed:           "+ plane.getPlaneSpeed()+" km/h");
					System.out.println("Plane cost:            "+ plane.getPlaneCost()+" $");
					System.out.println("Plane Fuel capacity:   "+ plane.getFuelCapacity()+" ltr");
					System.out.println("Plane range of flight: "+ plane.getRangeOfFlight()+" km");
					System.out.println();
				}
			}
		}
	}
	
	public void totalCargo() {
		int a = 0;
		if (planes != null) {
			for (Plane plane : planes) {
				if (plane != null) {
					a = a + plane.get;
					System.out.println();
				}
			}
			totalCargo = a;
			System.out.println("Total cargo is: " + totalCargo);
		}
	}
}

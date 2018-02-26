package by.htp.model;

public class AirLine {
	
	int countOfPrivatPlane;
	int countOfPassengerPlane;
	int countOfCargoPlane;
	
	public PrivatPlane[] privatPlane;
	public PassengerPlane[] passengerPlane;
	public CargoPlane[] cargoPlane;
	
	
	public void addPrivatPlane(PrivatPlane plane) {
		if (privatPlane != null) {
			if (countOfPrivatPlane < privatPlane.length) {
				privatPlane[countOfPrivatPlane] = plane;
				countOfPrivatPlane++;
			} else {
				PrivatPlane[] privatPlane = new PrivatPlane[this.privatPlane.length + 10];
				for (int i = 0; i < this.privatPlane.length; i++) {
					privatPlane[i] = this.privatPlane[i];
				}
				this.privatPlane = privatPlane;
				addNewPrivatPlane(plane);
			}
		} else {
			this.privatPlane = new PrivatPlane[10];
			addNewPrivatPlane(plane);
		}
	}

	private void addNewPrivatPlane(PrivatPlane plane) {
		this.privatPlane[countOfPrivatPlane] = plane;
		countOfPrivatPlane++;
	}


}

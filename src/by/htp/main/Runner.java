package by.htp.main;

import by.htp.model.AirLine;
import by.htp.model.PrivatPlane;
import by.htp.model.CargoPlane;
import by.htp.model.PassengerPlane;

public class Runner {

	public static void main(String[] args) {
		
	AirLine al = new AirLine();

	PrivatPlane jetflight1 = new PrivatPlane("jetflight 777");
	PrivatPlane jetflight2 = new PrivatPlane("jetflight 666");
	PrivatPlane jetflight3 = new PrivatPlane("jetflight 999");
	
	PassengerPlane airbus1 = new PassengerPlane("airbus 789");
	PassengerPlane airbus2 = new PassengerPlane("boing 727");
	PassengerPlane airbus3 = new PassengerPlane("airbus 79");
	PassengerPlane airbus4 = new PassengerPlane("boing 27");
	PassengerPlane airbus5 = new PassengerPlane("airbus 45");
	PassengerPlane airbus6 = new PassengerPlane("boing 777");
	
	
	CargoPlane cargo1 = new CargoPlane("Ан-225");
	CargoPlane cargo2 = new CargoPlane("Ан-124");

	al.addPlane(cargo2);
	al.addPlane(cargo1);
	al.addPlane(airbus6);
	al.addPlane(airbus5);
	al.addPlane(airbus4);
	al.addPlane(airbus3);
	al.addPlane(airbus2);
	al.addPlane(airbus1);
	al.addPlane(jetflight3);
	al.addPlane(jetflight2);
	al.addPlane(jetflight1);
	
	al.airLineInform();
	
	al.totalCargo();
		
	}

}

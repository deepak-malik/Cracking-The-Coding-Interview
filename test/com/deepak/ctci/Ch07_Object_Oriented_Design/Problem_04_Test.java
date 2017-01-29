package com.deepak.ctci.Ch07_Object_Oriented_Design;

import org.junit.Test;

import com.deepak.ctci.Ch07_Object_Oriented_Design.Problem_04.Bus;
import com.deepak.ctci.Ch07_Object_Oriented_Design.Problem_04.Car;
import com.deepak.ctci.Ch07_Object_Oriented_Design.Problem_04.Motorcycle;
import com.deepak.ctci.Ch07_Object_Oriented_Design.Problem_04.ParkingLot;
import com.deepak.ctci.Ch07_Object_Oriented_Design.Problem_04.Vehicle;
import com.deepak.ctci.Library.HelperMethods;

public class Problem_04_Test {

	@Test
	public void testParkingLot() {
		ParkingLot lot = new ParkingLot();
		Vehicle v = null;
		while (v == null || lot.parkVehicle(v)) {
			lot.print();
			int r = HelperMethods.randomIntInRange(0, 10);
			if (r < 2) {
				v = new Bus();
			} else if (r < 4) {
				v = new Motorcycle();
			} else {
				v = new Car();
			}
			System.out.print("\nParking a ");
			v.print();
			System.out.println("");
		}
		System.out.println("Parking Failed. Final state: ");
		lot.print();
	}
}

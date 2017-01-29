package com.deepak.ctci.Ch07_Object_Oriented_Design;

import java.util.ArrayList;

/**
 * <br> Problem Statement :
 * 
 * Design a parking lot using object oriented principles.
 * 
 * NOTE : Below are the assumptions made, 
 * 	1. The parking lot has multiple levels. Each level has multiple rows of spots.
 * 	2. The parking lot can park motorcycles, cars and buses.
 * 	3. The parking lot has motorcycle spots, compact spots and large spots.
 * 	4. A motorcycle can be parked in any spot.
 * 	5. A car can be parked in either in single compact spot or single large spot.
 * 	6. A bus can be parked in five large spots that are consecutive and within the same row. It cannot be parked in small spots. 
 * 
 * <br>
 * 
 * @author Deepak
 */
public class Problem_04 {

	public static class ParkingLot {
		private Level[] levels;
		private final int NUM_LEVELS = 5;
		
		public ParkingLot() {
			levels = new Level[NUM_LEVELS];
			for (int i = 0; i < NUM_LEVELS; i++) {
				levels[i] = new Level(i, 30);
			}
		}
		
		/* Park the vehicle in a spot (or multiple spots). Return false if failed. */
		public boolean parkVehicle(Vehicle vehicle) {
			for (int i = 0; i < levels.length; i++) {
				if (levels[i].parkVehicle(vehicle)) {
					return true;
				}
			}
			return false;
		}
		
		public void print() {
			for (int i = 0; i < levels.length; i++) {
				System.out.print("Level" + i + ": ");
				levels[i].print();
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static abstract class Vehicle {

		protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
		protected String licensePlate;
		protected int spotsNeeded;
		protected VehicleSize size;
		
		public int getSpotsNeeded() {
			return spotsNeeded;
		}
		
		public void parkInSpot(ParkingSpot spot) {
			parkingSpots.add(spot);
		}
		
		public void clearSpots() {
			for (int i = 0; i < parkingSpots.size(); i++) {
				parkingSpots.get(i).removeVehicle();
			}
			parkingSpots.clear();
		}
		
		public abstract boolean canFitInSpot(ParkingSpot spot);
		public abstract void print();
	}

	public static class Bus extends Vehicle {
		
		public Bus() {
			spotsNeeded = 5;
			size = VehicleSize.Large;
		}

		@Override
		public boolean canFitInSpot(ParkingSpot spot) {
			return spot.getSize() == VehicleSize.Large;
		}

		@Override
		public void print() {
			System.out.println("Bus");
		}

	}

	public static class Car extends Vehicle {
		
		public Car() {
			spotsNeeded = 1;
			size = VehicleSize.Compact;
		}

		@Override
		public boolean canFitInSpot(ParkingSpot spot) {
			return spot.getSize() == VehicleSize.Compact;
		}

		@Override
		public void print() {
			System.out.println("Car");
		}

	}

	public static class Motorcycle extends Vehicle {

		public Motorcycle() {
			spotsNeeded = 1;
			size = VehicleSize.Motorcyle;
		}

		@Override
		public boolean canFitInSpot(ParkingSpot spot) {
			return spot.getSize() == VehicleSize.Motorcyle;
		}

		@Override
		public void print() {
			System.out.println("Motorcycle");
		}
	}

	public static class ParkingSpot {

		private Vehicle vehicle;
		private VehicleSize spotSize;
		private int rowNumber;
		private int spotNumber;
		private Level level;
		
		public ParkingSpot(Level level, int rowNumber, int spotNumber, VehicleSize size) {
			this.level = level;
			this.rowNumber = rowNumber;
			this.spotNumber = spotNumber;
			this.spotSize = size;
		}
		
		public VehicleSize getSize() {
			return spotSize;
		}

		public boolean isAvailable() {
			return vehicle == null;
		}
		
		public int getRowNumber() {
			return rowNumber;
		}
		
		public int getSpotNumber() {
			return spotNumber;
		}
		
		public boolean canFitVehicle(Vehicle vehicle) {
			return isAvailable() && vehicle.canFitInSpot(this);
		}
		
		public boolean park(Vehicle v) {
			if (!canFitVehicle(v)) {
				return false;
			}
			vehicle = v;
			vehicle.parkInSpot(this);
			return true;
		}
		
		public void removeVehicle() {
			level.spotFreed();
			vehicle = null;
		}
		
		public void print() {
			if (vehicle == null) {
				if (spotSize == VehicleSize.Large) {
					System.out.println("Bus");
				} else if (spotSize == VehicleSize.Compact) {
					System.out.println("Car");
				} else if (spotSize == VehicleSize.Motorcyle) {
					System.out.println("Motorcycle");
				}
			} else {
				vehicle.print();
			}
		}

	}

	public static class Level {
		
		private int floor;
		private ParkingSpot[] spots;
		private int availableSpots = 0;
		private static final int SPOTS_PER_ROW = 10;
		
		public Level(int floor, int numOfSpots) {
			this.floor = floor;
			spots = new ParkingSpot[numOfSpots];
			int largeSpots = numOfSpots / 4;
			int motorcycleSpots = numOfSpots / 4;
			int compactSpots = numOfSpots - largeSpots - motorcycleSpots;
			for (int i = 0; i < numOfSpots; i++) {
				VehicleSize size = VehicleSize.Motorcyle;
				if (i < largeSpots) {
					size = VehicleSize.Large;
				} else if (i < largeSpots + compactSpots) {
					size = VehicleSize.Compact;
				}
				int row = i / SPOTS_PER_ROW;
				spots[i] = new ParkingSpot(this, row, i, size);
			}
			availableSpots = numOfSpots;
		}
		
		public int availableSpots() {
			return availableSpots;
		}
		
		public int getFloor() {
			return floor;
		}
		
		public boolean parkVehicle(Vehicle vehicle) {
			if (availableSpots() < vehicle.getSpotsNeeded()) {
				return false;
			}
			int spotNumber = findAvailableSpots(vehicle);
			if (spotNumber < 0) {
				return false;
			}
			return parkStartingAtSpot(spotNumber, vehicle);
		}

		private boolean parkStartingAtSpot(int spotNumber, Vehicle vehicle) {
			vehicle.clearSpots();
			boolean success = true;
			for (int i = spotNumber; i < spotNumber + vehicle.spotsNeeded; i++) {
				 success &= spots[i].park(vehicle);
			}
			availableSpots -= vehicle.spotsNeeded;
			return success;
		}

		private int findAvailableSpots(Vehicle vehicle) {
			int spotsNeeded = vehicle.getSpotsNeeded();
			int lastRow = -1;
			int spotsFound = 0;
			for (int i = 0; i < spots.length; i++) {
				ParkingSpot spot = spots[i];
				if (lastRow != spot.getRowNumber()) {
					spotsFound = 0;
					lastRow = spot.getRowNumber();
				}
				if (spot.canFitVehicle(vehicle)) {
					spotsFound++;
				} else {
					spotsFound = 0;
				}
				if (spotsFound == spotsNeeded) {
					return i - (spotsNeeded - 1);
				}
			}
			return -1;
		}
		
		public void print() {
			int lastRow = -1;
			for (int i = 0; i < spots.length; i++) {
				ParkingSpot spot = spots[i];
				if (spot.getRowNumber() != lastRow) {
					System.out.print("  ");
					lastRow = spot.getRowNumber();
				}
				spot.print();
			}
		}

		public void spotFreed() {
			availableSpots++;
		}

	}

	public enum VehicleSize {
		Motorcyle, Compact, Large
	}

}

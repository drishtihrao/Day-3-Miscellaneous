package com.cg.miscellaneous.vehicle;
/*
 * This class is used for defining method to change the speed of the vehicle, take right, take left
 * All the general information about the vehicle is given by the user
 */
public class Vehicle {
	private int speed;
	private int degree;
	private String ownerName;
	private static int identificationNumber = 50000;
	private int vehicleIdNo;
	protected static final int TURN_LEFT = 1;
	protected static final int TURN_RIGHT = 0;

	public Vehicle() {
		vehicleIdNo = identificationNumber + 1;
		identificationNumber += 1;
	}

	public Vehicle(String name) {
		vehicleIdNo = identificationNumber + 1;
		identificationNumber += 1;
		this.ownerName = name;
	}

	public static int getHighestIdentificationNumber() {
		return identificationNumber;
	}

	public int getVehicleIdNo() {
		return vehicleIdNo;
	}

	public int getSpeed() {
		return speed;
	}

	public void changeSpeed(int speed) {
		this.speed = speed;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		if (degree < 0)
			this.degree += 360;
		this.degree = degree % 360;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	//defining method to take right or left turn
	public int turnLeftRight(int turn) {
		this.degree = (turn == 1) ? ((this.degree + 90)) % 360 : ((this.degree - 90) % 360);
		return degree;
	}

	//defining method to change direction of the vehicle
	public int changeDirection(int change) {
		if (this.degree == change)
			System.out.println("Entered Direction is same");
		else
			this.degree = change;
		return degree;
	}

	public void stop() {
		this.speed = 0;
	}

	@Override
	public String toString() {
		return "Vehicle speed = " + speed + ", degree = " + degree + ", ownerName = " + ownerName + ", vehicleIdNo = "
				+ vehicleIdNo + ".";
	}
}

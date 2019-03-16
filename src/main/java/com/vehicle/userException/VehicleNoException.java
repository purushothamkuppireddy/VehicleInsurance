package com.vehicle.userException;

public class VehicleNoException extends Exception {
public VehicleNoException(){
	System.err.println("entered vehicle number is not registered for insurance");
}
}

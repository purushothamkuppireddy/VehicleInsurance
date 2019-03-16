package com.vehicle.model;

public class Customer {

private String vehicleType;
private int insurancePeriod;
private long aadharNo;
private long mobileNo;
private String dateOfR;


public String getDateOfR() {
	return dateOfR;
}
public void setDateOfR(String dateOfR) {
	this.dateOfR = dateOfR;
}

public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public int getInsurancePeriod() {
	return insurancePeriod;
}
public void setInsurancePeriod(int insurancePeriod) {
	this.insurancePeriod = insurancePeriod;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}



}

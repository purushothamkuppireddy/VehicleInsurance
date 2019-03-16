package com.vehicle.insuranceDao;

import com.vehicle.model.Customer;

public interface VehicleInsuranceDao {
	public boolean registration(int vehicleNo,Customer customer);
	public Customer validity(int vehicleNo) ;
}

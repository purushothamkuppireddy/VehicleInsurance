package com.vehicle.insuranceService;

import com.vehicle.model.Customer;

public interface VehicleInsuranceService {
	public boolean registration(int vehicleNo,Customer customer);
	public Customer validity(int vehicleNo) ;
}

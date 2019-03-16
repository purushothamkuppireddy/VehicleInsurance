package com.vehicle.insuranceService;

import com.vehicle.insuranceDao.VehicleInsuranceDaoImpl;
import com.vehicle.model.Customer;

public class VehicleInsuranceServiceImpl implements VehicleInsuranceService {
	static VehicleInsuranceDaoImpl dao = new VehicleInsuranceDaoImpl();
	static Customer customer = new Customer();
	
	
	public boolean registration(int vehicleNo, Customer customer) {
	
		return dao.registration(vehicleNo, customer);
	}

	public Customer validity(int vehicleNo) {
		
		return  dao.validity(vehicleNo);
	}

	

}

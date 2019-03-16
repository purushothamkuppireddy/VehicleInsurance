package com.vehicle.insuranceDao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.vehicle.model.Customer;

class VehicleInsuranceDaoImplTest {
	static VehicleInsuranceDaoImpl dao = new VehicleInsuranceDaoImpl();
	static Customer customer = new Customer();
	@Test
	void testRegistration() {
		
		customer.setVehicleType("two");
		customer.setAadharNo(897465);
		customer.setDateOfR("16/02/2019");
		customer.setInsurancePeriod(2);
		customer.setMobileNo(8645);
		assertEquals(true, dao.registration(1000, customer));
	}

	@Test
	void testValidity() {
		assertEquals(null, dao.validity(1002));
	}

}

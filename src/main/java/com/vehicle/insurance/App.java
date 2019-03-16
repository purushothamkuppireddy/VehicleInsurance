package com.vehicle.insurance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.vehicle.insuranceDao.VehicleInsuranceDao;
import com.vehicle.insuranceDao.VehicleInsuranceDaoImpl;
import com.vehicle.insuranceService.VehicleInsuranceServiceImpl;
import com.vehicle.model.Customer;
import com.vehicle.userException.VehicleNoException;

public class App {
	static Customer customer = new Customer();
	static VehicleInsuranceServiceImpl serv = new VehicleInsuranceServiceImpl();

	public static void main(String[] args) {
		
		int i=1;
		while(i==1) {
		System.out.println("enter the choice 1:Insurance Registration , 2:Validity check  3:Exit");
		Scanner sc = new Scanner(System.in);
		customer = new Customer();
		int ch = sc.nextInt();
		switch (ch) {
		case 1:// insurance registration
			System.out.println("enter the Vehicle No");
			int vehicle = sc.nextInt();
			System.out.println("enter the Vehicle Type");
			customer.setVehicleType(sc.next());
			System.out.println("enter the Insurance period in years");
			customer.setInsurancePeriod(sc.nextInt());
			System.out.println("enter Aadhar no");
			customer.setAadharNo(sc.nextLong());
			System.out.println("enter mobile no");
			customer.setMobileNo(sc.nextLong());
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			String s = formatter.format(date);
			//System.out.println(s);
			customer.setDateOfR(s);
			boolean b =serv.registration(vehicle, customer);
			if(b==true)
				System.out.println("successfully registered");
			else
				System.out.println("error in registering");
			break;
		case 2:// validity
			System.out.println("Enter the vehicleNo");
			int vehicleNo = sc.nextInt();
			customer=serv.validity(vehicleNo);
			if(customer!= null)
			System.out.println(" your insurance expires on  "+customer.getDateOfR());
			
			else
			{
				try {
					throw new VehicleNoException();
				} catch (VehicleNoException e) {
					
				}
			}
			break;
		case 3://exit
			System.out.println("Thank You..");
			System.exit(0);
		}
		}
	}
}

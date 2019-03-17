package com.vehicle.insuranceDao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

//import com.cg.mra.beans.Account;
import com.vehicle.model.Customer;

public class VehicleInsuranceDaoImpl implements VehicleInsuranceDao {

	HashMap <Integer,Customer> custEntry=new HashMap<Integer,Customer>(); 
	Customer customer=new Customer();

	
	//registration
	public boolean registration(int vehicleNo,Customer customer)
	{
		custEntry.put(vehicleNo, customer);
		//System.out.println(custEntry.keySet()+" "+custEntry.values());
		return true;
	}
	
	//validity
	public Customer validity(int vehicleNo) 
	{
		int count=0;
		//String s;

		Integer I=vehicleNo;
		for (Map.Entry<Integer,Customer> me : custEntry.entrySet()) {

		if (I.equals(me.getKey())) 
		{
			customer = me.getValue();
			//s=customer.getDateOfR();
			String dt = customer.getDateOfR();
			String dt2;
			int days=customer.getInsurancePeriod()*365;
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			Calendar c = Calendar.getInstance();
			try {
				c.setTime(sdf.parse(dt));
				c.add(Calendar.DATE, days);  // number of days to add
				dt2 = sdf.format(c.getTime());
				customer.setDateOfR(dt2);
				String arr1[]=dt.split("/");
				String arr2[]=dt2.split("/");
				int y1=Integer.parseInt(arr1[2]);
				int y2=Integer.parseInt(arr2[2]);
				//System.out.println((y2-y1)*365);
				customer.setDaysRemaining((y2-y1)*365);
				
				
				
			} catch (ParseException e) {
				
			}
			
			
			count++;
					
		
		}

		
		}

	
if(count!=0)
return customer;	
else		
return null;
	}
	
	
}

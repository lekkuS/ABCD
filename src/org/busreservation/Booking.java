package org.busreservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	 String passengerName;
	 int busNo;
	 Date date;
	public Booking() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name of Passenger");
		 passengerName = scanner.next();
		 System.out.println("Enter The bus no");
		 busNo=scanner.nextInt();
		 System.out.println("Enter date dd-MM-yyyy");
		 String dateInput = scanner.next();
		 SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		 try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if (bus.getBusNo()==busNo) 
				 capacity = bus.getCapacity();
				
			}
			int booked=0;
			for(Booking b:bookings) {
				if (b.busNo==busNo && b.date.equals(date)) {
					booked++;
					
					
				}
		
			}
		
		return booked<capacity?true:false;
		
	}

}

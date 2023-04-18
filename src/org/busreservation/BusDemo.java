 package org.busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
	public static void main(String[] args) {
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,false,40));
		buses.add(new Bus(3,true,48));
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		int userOpt=1;
		for (Bus b : buses) {
			b.displayBusInfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt= scan.nextInt();
			if (userOpt==1) {
				Booking booking=new Booking();
						if (booking.isAvailable(bookings,buses)) {
							bookings.add(booking);
							System.out.println("Your Booking is conform");
							
						}
						else {
							System.out.println("NO");
							
						}
			}
			
				
			
			
		}
		
		
		
		
	}

}

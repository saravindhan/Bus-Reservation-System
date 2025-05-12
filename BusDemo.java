package busReservation;
import java.util.Scanner;
import java.util.ArrayList;


public class BusDemo {

	public static void main(String[] args) {
		
	    /*	Bus[] buses = new Bus[50]; //ArrayList - collection is dynamic Array so it good for when space is not wasted... */
		// We are going for ArrayList
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		//Information About the Buses
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		int userOption = 1;
		Scanner sc = new Scanner(System.in);
		
		// If we want to see bus details we want to invoke with the bus object so first we need to iterate the list.
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		
		while(userOption!=2) {
			System.out.println("Enter 1 to book and 2 to exit : ");
			userOption = sc.nextInt();
			if(userOption==1) {
				System.out.println("Booking...");
				Booking book = new Booking();
				if(book.isAvail(bookings,buses)) {
					bookings.add(book);
					System.out.println("Your Booking is Confirmed");
				}
				else {
					System.out.println("Sorry bus is full. Try another bus or date");
				}
			}
		}

	}

}

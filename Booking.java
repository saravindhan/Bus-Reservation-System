package busReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	// Instance variables
	String passengerName;
	int busNo;
	Date date;
	
	//Constructor
	Booking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the passenger: ");
		this.passengerName = sc.next();
		System.out.println("Enter the Bus No: ");
		this.busNo = sc.nextInt();
		System.out.println("Enter the Date: dd-mm-yyyy");
		String dateInput = sc.next();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		try {
			this.date = format.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	// Method to check ticket Available
	public boolean isAvail(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}
		}
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity;
	}
}

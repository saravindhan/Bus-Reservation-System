package busReservation;

public class Bus {
	// Always Instance variable be private so that it can't easily accessible we can access through getters and setters.
	private int busNo;
	private boolean ac;
	private int capacity;

	//Constructor for bus class
	Bus(int no,boolean ac,int cap) {
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	//Getters and Setters
	//for capacity
	public int getCapacity() { //access method
		return capacity;
	}
	public void SetCapacity(int cap) { //changeable method
		capacity = cap;
	}
	//for busNo we are using set method because busNo cant be changed it is fixed.
	public int getBusNo() {
		return busNo;
	}
	//for AC
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean val) {
		ac = val;
	}
	
	//Displaying the Bus Information we are going to set the Display Method
	public void displayBusInfo() {
		System.out.println("Bus No: " + busNo + "  Ac: " + ac + "  Capacity: " + capacity);
	}
}

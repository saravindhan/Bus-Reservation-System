# Bus Reservation System

This is a simple Bus Reservation System developed in Java that allows passengers to book tickets for available buses. It allows users to view bus details, check availability, and make bookings.

## Features

* **View Bus Details:** Displays information about all available buses, including bus number, AC availability, and capacity.
* **Make a Booking:** Allows passengers to book a seat on a bus, checking if there are available seats for the chosen bus and date.
* **Check Availability:** Before booking, the system checks if there is enough capacity for the selected bus and date.

## How to Use

1. Clone or download the repository to your local machine.
2. Compile the Java files:

   ```bash
   javac BusDemo.java Bus.java Booking.java
   ```
3. Run the application:

   ```bash
   java BusDemo
   ```
4. The program will display bus details. You can choose to make a booking or exit.

## Classes Overview

1. **Bus:**

   * Represents a bus with attributes such as `busNo`, `ac` (air conditioning), and `capacity`.
   * Has methods for displaying bus information and modifying its attributes.

2. **Booking:**

   * Represents a booking made by a passenger.
   * Allows the user to input their name, bus number, and date.
   * Checks if there is enough capacity in the bus for the selected date before confirming the booking.

3. **BusDemo:**

   * The main class that manages the bus reservation system.
   * Displays bus details and handles user input to make bookings.

## Code Explanation

* The **Bus** class contains information about each bus, such as its number, air conditioning status, and seating capacity.
* The **Booking** class handles the booking process by asking the user for their name, bus number, and travel date, and checks if there is available capacity.
* The **BusDemo** class displays the available buses and allows the user to book a bus seat or exit the program.

## Sample Output

### Bus Details:

```
Bus No: 1  Ac: true  Capacity: 2
Bus No: 2  Ac: false  Capacity: 50
Bus No: 3  Ac: true  Capacity: 48
```

### Booking:

```
Enter 1 to book and 2 to exit : 1
Booking...
Enter the Name of the passenger: John
Enter the Bus No: 2
Enter the Date: dd-mm-yyyy 12-05-2025
Your Booking is Confirmed
```

## Technologies Used

* Java 8 (or above)
* Simple Date Format for handling date input

## Future Enhancements

* Implement a GUI for the application.
* Add features for canceling bookings.
* Implement a database to store bus and booking information persistently.
* Handle edge cases such as invalid inputs.

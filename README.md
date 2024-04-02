# Cinema Reservation System

Cinema Reservation System is a Java program designed to manage seat reservations in a movie theater. It provides functionalities to check seat availability, reserve seats, and display information about the remaining seats in the cinema.

## Features

- **Check Seat Availability**: Users can check the availability of seats in the cinema.
- **Reserve Seats**: Users can reserve seats for a movie.
- **Display Reservation Info**: Information about the remaining seats and reservation details can be displayed.

## Usage

1. Clone the repository to your local machine.
2. Compile the Java files using a Java compiler.
3. Run the `testCinemaReservation` class to execute the program and test different functionalities.

## Example

```java
public class testCinemaReservation {

    public static void main(String[] args) {
        // Check remaining seats
        CinemaReservation.getRemainingSeats();
        
        // Create instances of CinemaReservation class
        CinemaReservation c = new CinemaReservation();
        CinemaReservation d = new CinemaReservation(8, "hi");
        CinemaReservation e = new CinemaReservation(3, "Hi", 4);
        
        // Check seat availability
        CinemaReservation.checkSeatAvailability();
        
        // Display cinema reservation info
        CinemaReservation.displayCinemaReservationInfo();
    }
    
}
```

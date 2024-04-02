
package cinemareservation;

public class testCinemaReservation {

    public static void main(String[] args) {
        CinemaReservation.getRemaining_steats();
        CinemaReservation c = new CinemaReservation();
        CinemaReservation d = new CinemaReservation(8, "hi");
        CinemaReservation e = new CinemaReservation(3, "Hi", 4);
        CinemaReservation.Check_seat_availability();
        CinemaReservation.Cinema_reservationinfo();
    }
    
}

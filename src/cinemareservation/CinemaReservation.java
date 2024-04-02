
package cinemareservation;

public class CinemaReservation {

    private int reservation_id;
    private final int NumOfSeat=60;
    private String movie_name;
    private int seats;
    private static int remaining_steats =60;
    

    public CinemaReservation() {
        this(0,"undefined", 1);
    }

    public CinemaReservation(int reservation_id, String movie_name) {
       this(reservation_id,movie_name, 0);
        this.reservation_id = reservation_id;
        this.movie_name = movie_name;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public int getNumOfSeat() {
        return NumOfSeat;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public int getSeats() {
        return seats;
    }

    public static int getRemaining_steats() {
        return remaining_steats;
    }

    public CinemaReservation(int reservation_id, String movie_name, int seats) {
        setReservation_id(reservation_id);
        setMovie_name(movie_name);
        setSeats(seats);
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public void setSeats(int seats) {
        
        this.seats = seats;
    }

    public static void setRemaining_steats(int remaining_steats) {
        CinemaReservation.remaining_steats = remaining_steats;
    }
    public static void Check_seat_availability (){
        if(setRemaining_steats()>=60){
            System.out.println("You can resive new ticket");
        }
        else
            System.out.println("You can not resive new ticket");
            
    } 
    public void  Cinema_reservationinfo  (){
        System.out.println("reservation_id: "+reservation_id);
        System.out.println("NumOfSeat: "+NumOfSeat);
        System.out.println("movie_name: "+movie_name);
        System.out.println("seats: "+seats);
        System.out.println("remaining_steats: "+remaining_steats);
    }
    
    }
    


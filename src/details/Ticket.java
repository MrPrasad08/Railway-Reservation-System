package details;

public class Ticket {

    private int ticketId;
    private Passenger passenger;
    private int seatNumber;

    public Ticket(int ticketId, Passenger passenger, int seatNumber) {
        this.ticketId = ticketId;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {

        return "Ticket ID : " + ticketId +
                "\nPassenger : " + passenger.getName() +
                "\nSeat No : " + seatNumber;
    }

}

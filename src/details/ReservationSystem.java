package details;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReservationSystem {

    private ArrayList<Ticket> bookedTickets = new ArrayList<>();
    private Queue<Integer> availableSeats = new LinkedList<>();

    private int passengerId = 1;
    private int ticketId = 101;

    public ReservationSystem() {

        // Total Seats = 5

        for (int i = 1; i <= 5; i++) {
            availableSeats.add(i);
        }

    }

    // Book Ticket

    public void bookTicket(String name, int age, String gender) {

        if (availableSeats.isEmpty()) {
            System.out.println("\nNo Seats Available!\n");
            return;
        }

        int seatNumber = availableSeats.poll();

        Passenger passenger = new Passenger(passengerId++, name, age, gender);

        Ticket ticket = new Ticket(ticketId++, passenger, seatNumber);

        bookedTickets.add(ticket);

        System.out.println("\nTicket Booked Successfully!");
        System.out.println(ticket);
        System.out.println();

    }

    // Cancel Ticket

    public void cancelTicket(int ticketId) {

        for (int i = 0; i < bookedTickets.size(); i++) {

            Ticket ticket = bookedTickets.get(i);

            if (ticket.getTicketId() == ticketId) {

                availableSeats.add(ticket.getSeatNumber());

                bookedTickets.remove(i);

                System.out.println("\nTicket Cancelled Successfully!\n");

                return;
            }

        }

        System.out.println("\nTicket Not Found!\n");

    }

    // Show Booked Tickets

    public void showBookedTickets() {

        if (bookedTickets.isEmpty()) {

            System.out.println("\nNo Tickets Booked.\n");
            return;

        }

        System.out.println("\n===== Booked Tickets =====");

        for (Ticket ticket : bookedTickets) {

            System.out.println(ticket);
            System.out.println("---------------------------");

        }

    }

    // Show Available Seats

    public void showAvailableSeats() {

        System.out.println("\nAvailable Seats : " + availableSeats);
        System.out.println();

    }

}

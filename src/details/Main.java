package details;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ReservationSystem reservation = new ReservationSystem();

        while (true) {

            System.out.println("=================================");
            System.out.println(" Railway Reservation System");
            System.out.println("=================================");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Show Booked Tickets");
            System.out.println("4. Show Available Seats");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Gender : ");
                    String gender = sc.nextLine();

                    reservation.bookTicket(name, age, gender);

                    break;

                case 2:

                    System.out.print("Enter Ticket ID : ");
                    int ticketId = sc.nextInt();

                    reservation.cancelTicket(ticketId);

                    break;

                case 3:

                    reservation.showBookedTickets();

                    break;

                case 4:

                    reservation.showAvailableSeats();

                    break;

                case 5:

                    System.out.println("\nThank You!\n");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("\nInvalid Choice!\n");

            }

        }

    }

}

package zoho3rdRound.RailwayBooking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("Give any of the options bevow \n 1. Book a Ticket \n 2. Cancel a Ticket \n " +
                    "3. Print Booked Ticket Details \n 4. Show Available Seats \n 5. Exit");
            System.out.println();
            System.out.print("Your Option : ");
            int n = input.nextInt();
            switch (n){
                case 1 :
                    System.out.print("Enter Name : ");
                    String name = input.next();
                    System.out.print("Age : ");
                    int age = input.nextInt();
                    System.out.print("Gender :");
                    String gender = input.next();
                    System.out.print("Berth :");
                    String berth = input.next();
                    CustomerDetail customerDetail = new CustomerDetail(name, age,gender,berth);
                    Booking bookingTicket = new Booking(customerDetail);

                    System.out.println("Ticket Booked , you Ticket ID is : "+ (IdForBooking.bookingId -1));
                    break;

                case 2:
                    System.out.print("Enter the ID number : ");
                    int cancelId = input.nextInt();
                    new CancellingTicket(cancelId);
                    break;

                case 3:
                    new PrintingBookedDetails();
                    break;

                case 4:
                    new PrintingSeatDetails();
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        }

    }
}

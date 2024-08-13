package TaxiBooking;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int totalTaxis = 4;
    static HashMap<Character, Integer> distanceOfPoint = new HashMap<>();
    static{

        for (int i = 1; i <= totalTaxis; i++) {

            TaxiList.taxiList.add(new Taxi(i,'A'));

        }

        distanceOfPoint.put('A',0);
        distanceOfPoint.put('B',15);
        distanceOfPoint.put('C',30);
        distanceOfPoint.put('D',45);
        distanceOfPoint.put('E',60);
        distanceOfPoint.put('F',75);

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println();
            System.out.println("1. Book a taxi \n2. Print Details \n3. Exit");
            System.out.print("Your choice : ");
            int in = input.nextInt();
            switch (in){
                case 1:{
                    System.out.print("Pickup Location : ");
                    char pickupLocation = input.next().charAt(0);
                    System.out.print("Drop Location : ");
                    char dropLocation = input.next().charAt(0);
                    System.out.print("Pickup Time : ");
                    int time = input.nextInt();
                    Booking booktaxi = new Booking();
                    booktaxi.bookingCheck(pickupLocation, dropLocation,time);


                }
                break;

                case 2: {
                    new Printing();

                }
                break;
                case 3:
                    input.close();
                    return;

                default:
                    System.out.println("Enter correct Option!");
            }
        }

    }
}

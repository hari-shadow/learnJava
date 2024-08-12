package zoho3rdRound.RailwayBooking;

public class PrintingSeatDetails {
    public PrintingSeatDetails(){
        System.out.println();
        System.out.println("Lower Berth Available : "+ SeatAvailable.lowerBerth);
        System.out.println("Middle Berth Available : "+ SeatAvailable.upperBerth);
        System.out.println("Upper Berth Available : "+ SeatAvailable.upperBerth);
        System.out.println("RAC  : "+ SeatAvailable.rac);
        System.out.println("Waiting List  : "+ SeatAvailable.waitingList);
    }
}

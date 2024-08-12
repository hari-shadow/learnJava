package zoho3rdRound.RailwayBooking;

public class IdForBooking {
    static int bookingId = 1;

    public static int getBookingId() {
        return bookingId++;
    }
}

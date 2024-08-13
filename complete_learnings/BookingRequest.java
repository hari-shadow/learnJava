public class BookingRequest {
    char pickupPoint;
    char dropPoint;
    int pickupTime;

    public BookingRequest(char pickupPoint, char dropPoint, int pickupTime){
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
        this.pickupPoint = pickupPoint;
    }


}

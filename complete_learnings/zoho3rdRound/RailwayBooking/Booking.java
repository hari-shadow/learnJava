package zoho3rdRound.RailwayBooking;

public class Booking {

    public Booking(CustomerDetail customerDetail){
        int idForBooking = IdForBooking.getBookingId();

        if(customerDetail.berth.equals("l")){
            if(SeatAvailable.lowerBerth != 0){
                customerDetail.bookedberth = "Lower Berth";
                SeatAvailable.lowerBerth--;
            }

            else if(SeatAvailable.middleBerth != 0){
                    customerDetail.bookedberth = "Middle Berth";
                    SeatAvailable.middleBerth--;
            }

            else if (SeatAvailable.upperBerth !=0){
                customerDetail.bookedberth = "Upper Berth";
                SeatAvailable.upperBerth--;
            }

            else if (SeatAvailable.rac != 0) {
                customerDetail.bookedberth = "RAC";
                SeatAvailable.rac--;
                BookedList.rac.offer(customerDetail);
            }

            else if (SeatAvailable.waitingList != 0) {
                customerDetail.bookedberth = "Waiting List";
                SeatAvailable.waitingList--;
                BookedList.waitingList.offer(customerDetail);
            }

            else {
                System.out.println("Seat Not Available");
                return;
            }
            BookedList.bookedList.put(idForBooking,customerDetail);
        }

        if(customerDetail.berth.equals("m")){
            if(SeatAvailable.middleBerth != 0){
                customerDetail.bookedberth = "Middle Berth";
                SeatAvailable.middleBerth--;
            }

            else if (SeatAvailable.upperBerth !=0){
                customerDetail.bookedberth = "Upper Berth";
                SeatAvailable.upperBerth--;
            }

            else if(SeatAvailable.lowerBerth != 0){
                customerDetail.bookedberth = "Lower Berth";
                SeatAvailable.lowerBerth--;
            }

            else if (SeatAvailable.rac != 0) {
                customerDetail.bookedberth = "RAC";
                SeatAvailable.rac--;
            }

            else if (SeatAvailable.waitingList != 0) {
                customerDetail.bookedberth = "Waiting List";
                SeatAvailable.waitingList--;
            }

            else {
                System.out.println("Seat Not Available");
                return;
            }

            BookedList.bookedList.put(idForBooking,customerDetail);
        }

        if(customerDetail.berth.equals("u")){
            if (SeatAvailable.upperBerth !=0){
                customerDetail.bookedberth = "Upper Berth";
                SeatAvailable.upperBerth--;
            }

            else if(SeatAvailable.middleBerth != 0){
                customerDetail.bookedberth = "Middle Berth";
                SeatAvailable.middleBerth--;
            }
            else if(SeatAvailable.lowerBerth != 0){
                customerDetail.bookedberth = "Lower Berth";
                SeatAvailable.lowerBerth--;
            }

            else if (SeatAvailable.rac != 0) {
                customerDetail.bookedberth = "RAC";
                SeatAvailable.rac--;
            }

            else if (SeatAvailable.waitingList != 0) {
                customerDetail.bookedberth = "Waiting List";
                SeatAvailable.waitingList--;
            }

            else {
                System.out.println("Seat Not Available");
                return;
            }

            BookedList.bookedList.put(idForBooking,customerDetail);
        }


    }

}

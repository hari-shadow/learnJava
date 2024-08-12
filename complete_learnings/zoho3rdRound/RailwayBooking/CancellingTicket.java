package zoho3rdRound.RailwayBooking;

public class CancellingTicket {
    public  CancellingTicket(int cancelId){
        CustomerDetail cancellingTicket = BookedList.bookedList.get(cancelId);

        BookedList.bookedList.remove(cancelId);
        try {
            if(!BookedList.rac.isEmpty()){
                BookedList.rac.poll().bookedberth = cancellingTicket.bookedberth;
            }
        }catch (NullPointerException e){
            System.out.println();
        }

        try {
            if(!BookedList.waitingList.isEmpty()){
                BookedList.rac.offer(BookedList.waitingList.poll());
            }
        }catch (NullPointerException e){
            System.out.println();
        }

    }
}

package zoho3rdRound.RailwayBooking;

public class PrintingBookedDetails {
    public PrintingBookedDetails(){
        for(CustomerDetail elements : BookedList.bookedList.values()){
            System.out.println(" Name : "+ elements.name + "\n Age : "+ elements.age + "\n Gender : "+elements.gender+"\n Booked Berth : "+ elements.bookedberth);
            System.out.println();
            System.out.println("----------------------------------------------------------------");
            System.out.println();
        }
    }
}

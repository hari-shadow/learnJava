package zoho3rdRound.RailwayBooking;

public class CustomerDetail {
    String name;
    int age;
    String gender;
    String berth;
    String bookedberth;


    public CustomerDetail(String name, int age, String gender, String  berth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berth = berth;
        this.bookedberth = "";

    }
}

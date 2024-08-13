package TaxiBooking;

import java.util.ArrayList;
import java.util.HashMap;

public class Taxi {
    int id;
    char currentLocation;
    boolean isFree = true;
    int earnings = 0;
    int freeingTime = 6;
    //HashMap<String,Integer> history = new HashMap<>();
    ArrayList<Character> history = new ArrayList<>();


    public Taxi(int id , char currentLocation){
        this.id = id;
        this.currentLocation = currentLocation;
    }

    public Taxi(){

    }
}

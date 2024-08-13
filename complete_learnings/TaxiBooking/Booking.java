package TaxiBooking;

import java.util.ArrayList;

public class Booking {

    static ArrayList<Taxi> findNearTaxi(char pickupLocation, int pickupTime){

        ArrayList<Taxi> nearAvailableTaxis = new ArrayList<>();

        int minDistance = Integer.MAX_VALUE;
        for(Taxi taxi : TaxiList.taxiList){
            if(taxi.isFree && Math.abs(taxi.currentLocation - pickupLocation) <= minDistance && canReachInTime(taxi,pickupLocation,pickupTime)){
                minDistance = taxi.currentLocation;
                nearAvailableTaxis.add(taxi);
            }
        }


        return nearAvailableTaxis;
    }

    public static boolean canReachInTime(Taxi taxi, char pickupLocation, int pickupTime){
        int timeForCoveringDistance = Math.abs(Main.distanceOfPoint.get(taxi.currentLocation)-Main.distanceOfPoint.get(pickupLocation))/15;
        return taxi.freeingTime + timeForCoveringDistance <=pickupTime;
    }

    public void bookingCheck(char pickupPoint, char dropPoint, int pickupTime){
        ArrayList<Taxi> nearAvailableTaxis = findNearTaxi(pickupPoint, pickupTime);

        if (nearAvailableTaxis.isEmpty()){
            System.out.println("Sorry , no taxis Available");
        }
        else {

            if(nearAvailableTaxis.size() > 1){
                Taxi theTaxi = new Taxi();
                int earnings = Integer.MAX_VALUE;
                for(Taxi taxi : nearAvailableTaxis){
                    if (taxi.earnings <= earnings ){
                        earnings = taxi.earnings;
                        theTaxi = taxi;
                    }
                }

                bookTheTaxi(theTaxi,pickupPoint,dropPoint,pickupTime, earningCalculation(pickupPoint, dropPoint));
            }
            else {

                bookTheTaxi(nearAvailableTaxis.get(0),pickupPoint,dropPoint, pickupTime,earningCalculation(pickupPoint, dropPoint));
            }

        }
    }

    public int earningCalculation(char pickupPoint, char dropPoint){
        int distance = Math.abs(Main.distanceOfPoint.get(pickupPoint) - Main.distanceOfPoint.get(dropPoint));

        return 100+(distance-5)*10;

    }

    public void bookTheTaxi(Taxi taxi,char pickupPoint, char dropPoint,int pickupTime, int earnings){
        System.out.println("Taxi "+ taxi.id+" is booked");
        taxi.isFree = false;
        taxi.earnings += earnings;
        taxi.currentLocation = dropPoint;
        taxi.freeingTime += Math.abs(Main.distanceOfPoint.get(pickupPoint)-Main.distanceOfPoint.get(dropPoint))/15;
        taxi.history.add(pickupPoint);
        taxi.history.add(dropPoint);
        taxi.history.add(Character.forDigit(pickupTime,10));
        taxi.history.add(Character.forDigit((Math.abs(Main.distanceOfPoint.get(pickupPoint)-Main.distanceOfPoint.get(dropPoint))/15),10));
        taxi.history.add(Character.forDigit(earnings,10));

    }

}

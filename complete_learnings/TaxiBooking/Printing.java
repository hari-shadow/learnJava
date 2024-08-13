package TaxiBooking;

public class Printing {
    public Printing(){
        for (Taxi taxi : TaxiList.taxiList){
            if(!taxi.history.isEmpty()){
                System.out.print("Taxi Number : "+taxi.id+" Total Earnings : "+taxi.earnings);
                System.out.println("\n-------------------------------------------------------------------------------");
                System.out.println("From    To    PickupTime    DropTime    Amount Earned");
                System.out.println(" "+taxi.history.get(0)+"      "+taxi.history.get(1)+"         "+taxi.history.get(2)
                        +"             "+taxi.history.get(3)+"               "+taxi.history.get(4));





                System.out.println();
            }


        }

    }
}

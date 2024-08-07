package OOPS.Interfaces;

public class DieselEngine implements Engine{
    //ignore the below when revising about interfaces
    @Override
    public void start() {
        System.out.println("start as Diesel Engine");
    }

    @Override
    public void stop() {
        System.out.println("stops as Diesel Engine");
    }

    @Override
    public void acc() {
        System.out.println("acc as Diesel Engine");
    }
//---------------------------------------------------
    @Override
    public void startEngine() {
        System.out.println("start as Diesel Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stops as Diesel Engine");
    }

    @Override
    public void accEngine() {
        System.out.println("acc as Diesel Engine");
    }
}

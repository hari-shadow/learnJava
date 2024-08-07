package OOPS.Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power Engine Start");
    }

    //ignore the below when revising about interfaces
    @Override
    public void stop() {

        System.out.println("Power Engine stops");
    }

    @Override
    public void acc() {

        System.out.println("Power Engine acc");
    }
//----------------------------------------------------
    @Override
    public void startEngine() {
        System.out.println("Power Engine Start");
    }

    @Override
    public void stopEngine() {

        System.out.println("Power Engine stops");
    }

    @Override
    public void accEngine() {

        System.out.println("Power Engine acc");
    }
}

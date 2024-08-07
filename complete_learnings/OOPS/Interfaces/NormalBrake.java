package OOPS.Interfaces;

public class NormalBrake implements Brake{
    @Override
    public void brake() {
        System.out.println("gives normal brake");
    }
}

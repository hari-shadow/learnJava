package OOPS.Interfaces;

public class HariCar {
    public static void main(String[] args) {

        CarTemplate obj = new CarTemplate(new PowerEngine(),new DiscBrake(),new Samsung());
        CarTemplate obj1 = new CarTemplate(new DieselEngine(), new NormalBrake(),new Panasonic());
        obj.startEngine();
        obj.startMusic();
        obj.accEngine();
        obj.brake();
        obj.stopMusic();
        obj.stopEngine();

        System.out.println();

        obj1.startEngine();
        obj1.startMusic();
        obj1.accEngine();
        obj1.brake();
        obj1.stopMusic();
        obj1.stopEngine();

    }


}

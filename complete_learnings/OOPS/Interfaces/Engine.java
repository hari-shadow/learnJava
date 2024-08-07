package OOPS.Interfaces;

public interface Engine {

    int n =1;

    void start();
    void stop();
    void acc();


    void startEngine();
    void stopEngine();
    void accEngine();

    static void num(int num){
        System.out.println(num);
    }

}

package OOPS.Singleton;

public class SingletonClass {
    int num;
    private SingletonClass() {

    }
    private static SingletonClass instanceforthisclass;

    public static SingletonClass getinstance(){
        if(instanceforthisclass == null){
            return new SingletonClass();
        }
        return instanceforthisclass;
    }
}
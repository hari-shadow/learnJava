package OOPS.Singleton;

public class Main {
    public static void main(String[] args) {
//        SingletonClass obj = new SingletonClass();
        SingletonClass obj = SingletonClass.getinstance();
        obj.num = 4;
        System.out.println(obj.num);
    }
}

package Functions;

public class Shadowing {
    static int a = 5;

    public static void main(String[] args) {
        System.out.println(a);
        int a;
//        System.out.println(a);
        a = 6;
        System.out.println(a);
        fun();
    }

    static void fun() {
        System.out.println(a);
    }
}

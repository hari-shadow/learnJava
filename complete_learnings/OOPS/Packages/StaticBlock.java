package OOPS.Packages;

public class StaticBlock {
    static int a = 5;
    static int b = a*5;

    static {
        int c = 51;
        System.out.println(c);
    }

    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(b);
    }
}

package Functions;

public class FunctionPassbyValue {
    public static void main(String[] args) {
//        int a = 34;
//        int b= 45;
//        swap(a);
//        System.out.println(a);


        String name = "hari";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam) {
        naam = "nari";

    }

    static void swap(int a) {
        a = 56;
    }
}

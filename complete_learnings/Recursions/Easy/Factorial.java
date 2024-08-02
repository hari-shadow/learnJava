package Recursions.Easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        int a = n * fact(n - 1);
        System.out.println(a);
        return a;
    }
}

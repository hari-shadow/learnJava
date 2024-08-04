package Recursions.Easy;

public class Count0 {
    static int count = 0;
    static void check (int n){
        if (n == 0){
            return;
        }
        if (n % 10 == 0){
            count++;
        }

        check(n / 10);
    }
    public static void main(String[] args) {
        check(405045000);
        System.out.println(count);
    }
}

package Recursions.Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(234));
    }
    static int sum(int n){
        if (n == 0){
            return 0;
        }
        int a = n % 10;
        return a + sum(n/10);
    }
}

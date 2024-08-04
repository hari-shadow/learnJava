package Recursions.Easy;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n){
        if (n == 1){
            return 1;
        }
        int a = n + sum(n - 1);
        return a;
    }
}

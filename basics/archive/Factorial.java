package archive;


public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        System.out.println(ans);
    }
}

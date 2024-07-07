package Functions;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(fact(n));

        input.close();
    }

    static int fact(int n) {
        int ans = 1;
        while (n > 0) {

            ans *= n;
            n--;

        }

        return ans;
    }

}

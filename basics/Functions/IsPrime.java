package Functions;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int num = input.nextInt();
//        System.out.println(isPrime(num));

        int i = 1;
        while (i <= 101) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        }

        input.close();
    }

    static boolean isPrime(int n) {
        int i = 2;
        for (; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return i * i > n;

    }

}

package Functions;


import java.util.Scanner;

public class Palindrome {

    public static void main(String[] hari) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        System.out.println(palindrome(num));


        input.close();

    }

    static boolean palindrome(int n) {
        int original = n;
        int rev = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return original == rev;

    }
}

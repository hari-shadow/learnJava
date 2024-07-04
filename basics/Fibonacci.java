import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N : "); //long for input 100 or higher
        int n = input.nextInt();
        long num1 = 0;
        long num2 = 1;
        //int num3=0;
        for (int i = 0; i < n; i++) {

            System.out.print(num1 + " ");
            long num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

    }
}

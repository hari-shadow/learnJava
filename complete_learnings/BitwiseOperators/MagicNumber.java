package BitwiseOperators;

import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter = 0;
        int ans = 0;
        int base = 5;
        while (n > 0){
            int end = n & 1;
            ans += base * end;
            n = n >> 1;
            base *= 5;
            counter++;

        }
        System.out.println(ans);
        System.out.println(counter);

        input.close();
    }
}

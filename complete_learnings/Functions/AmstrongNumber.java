package Functions;

public class AmstrongNumber {
    public static void main(String[] args) {

        for (int i = 100; i <= 1000; i++) {
            if (isAmstrong(i)) {
                System.out.print(i + " ");
            }
        }


    }

    static boolean isAmstrong(int num) {
        int original = num;
        int rem;
        int check = 0;
        while (num > 0) {
            rem = num % 10;
            num /= 10;
            check += (rem * rem * rem);

        }

        return check == original;
    }


}

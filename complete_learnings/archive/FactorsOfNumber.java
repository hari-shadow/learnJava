package archive;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Excluding the factors 1 and " + n);
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;

        }

    }
}

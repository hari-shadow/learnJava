package BitwiseOperators;

public class NoOfDigits {
    public static void main(String[] args) {
        int a = 56;
        int b =16;
        int digit = (int) (Math.log(a) / Math.log(b) + 1);
        System.out.println(digit);
    }
}

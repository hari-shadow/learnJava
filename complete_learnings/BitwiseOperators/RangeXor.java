package BitwiseOperators;

public class RangeXor {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(rangeXor(a,b));
    }

    private static int rangeXor(int a, int b) {

        return xor(b) ^ xor(a-1);
    }

    static int xor(int n){
        switch (n % 4) {
            case 0 -> {
                return n;
            }
            case 1 -> {
                return 1;
            }
            case 2 -> {
                return n + 1;
            }
            case 3 -> {
                return 0;
            }
        }
        return -1;
    }
}

package BitwiseOperators;

public class XorOperator {
    public static void main(String[] args) {
        int[] arr = {-2,-3,-5,-6,-2,-3,-5};
        System.out.println(operate(arr));
    }

    private static int operate(int[] arr) {
        int store = 0;
        for(int ele :arr){
            store ^= ele;
        }
        return store;
    }
}

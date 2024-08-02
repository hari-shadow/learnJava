package BitwiseOperators;

public class Solving {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,3,5,4,2,4,4};
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){
        int store = 0;
        for(int el : arr){
            store += el|0;
        }
        return store%3;
    }
}

package BitwiseOperators;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;

        int start = 0;
        int end = n;
        while (start <= end ){
            int mid = start + (end - start)/2;
            if (mid * mid == n){
                System.out.println(mid);
            }
            if (mid * mid < n){
                start = mid;
            }
            else {
                end = mid -1;
            }
        }
    }
}

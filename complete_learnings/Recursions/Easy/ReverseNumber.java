package Recursions.Easy;

public class ReverseNumber {
    public static void main(String[] args) {
        rev2(245535334);
        System.out.println(sum);
    }
    static int rev(int n){ // way 1
        if (n%10 ==n){
            return n;
        }
        int digitCount =(int) (Math.log(n)/ Math.log(10))+1;
        int place = (int) Math.pow(10, digitCount-1);
        return (n%10)*place + rev(n/10);
    }

    //way 2
    static int sum = 0;
    static void rev2(int n){
        if (n ==  0){
            return;
        }
        int rem = n %10;
        sum = sum*10 + rem ;
        rev2(n/10);
    }
}

package Recursions;

public class Fibonocci {
    public static void main(String[] args) {
        System.out.println(fibo(44));

    }
    static int fibo(int n){
        if (n == 1){
            return 1;
        }
        if (n== 0 ){
            return 0;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

package Recursions.Easy;

public class iconcept {
    public static void main(String[] args) {
//        System.out.println(fun(5));
        fun(5);
    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(--n);
    }
}

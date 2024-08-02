package Recursions.Easy;

public class fivetoone {
    public static void main(String[] args) {
        prot1(6);
    }
    static void prot1 (int n ){
        if ( n == 0){
            return;
        }
        prot1(n-1);
        System.out.println(n);
    }
    static void prot2 (int n ){
        if ( n == 0){
            return;
        }
        System.out.println(n);
        prot2(n-1);
    }
    static void prot3 (int n ){
        if ( n == 0){
            return;
        }
        System.out.println(n);
        prot3(n-1);
        System.out.println(n);
    }
}

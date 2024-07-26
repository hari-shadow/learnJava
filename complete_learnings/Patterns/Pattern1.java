package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
//        pattern2(5);
        pattern30(5);
    }
    static void pattern30 ( int n){
        for (int i = 1; i <= n ; i++) {
//            int col = i<=n ? i:
            int spaces = n-i;
            for (int j = 1; j <=spaces ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern28 ( int n){
        for (int i = 1; i <= 2*n -1 ; i++) {
            int col = i <= n ?i: 2*n -i;
            int beforeSpaces = n - col;
//            int beforeSpaces = i <= n ?n - i:i-n;
            for (int j = 1; j <= beforeSpaces; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5 (int n){
        for (int i = 1; i <n*2 ; i++) {
            if (i<= n){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+ " ");
                }
                System.out.println();
            }
            else {
                for(int j = 1; j <= 2*n -i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();

            }


        }
    }
    static void pattern2 (int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern1 (int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3 (int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

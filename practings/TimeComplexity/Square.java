import java.util.Scanner;

public class Square{
    static void square(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
    }
    static void cubic(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int j2 = 1; j2 <= n; j2++) {
                    System.out.print(i+""+j+""+j2+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    static void log(int n){
        if(n%2 == 0){
            System.out.println("Done");
            
        }
        if(n == 0){
            return;
        }
        log(n/2);
    }
    static void just(int n){
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        log(n);


        input.close();
    }
}
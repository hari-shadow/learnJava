package Zoho2ndRound;

public class q17 {
    public static void main(String[] args) {
        int n = 4;
//        for (int i = 1; i <= n * n; i++) {
//            if(! (i%n == 0)){
//                System.out.print(i+" ");
//            }else {
//                System.out.print(i+"\n");
//            }
//        }
        int num = 1;
        for (int i = 1; i <= n; i++) {
            if(!(i %2 == 0)){
                for (int j = 0; j < n; j++) {
                    System.out.print(num+" ");
                    num++;
                }
            }
            else {
                int temp = n +num -1;
                for (int j = 0; j < n; j++) {
                    System.out.print(temp + " ");
                    temp--;
                }
                num = n+num;
            }
            System.out.println();
        }
    }
}

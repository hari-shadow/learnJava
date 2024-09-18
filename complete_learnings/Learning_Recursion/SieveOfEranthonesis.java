import java.util.Scanner;

public class SieveOfEranthonesis{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean arr[] = new boolean[n+1];
        
        for (int i = 2; i*i <= n; i++) {
            if(!arr[i]){
                for (int j = i*2; j < arr.length; j+= i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }


        input.close();
    }
    
}
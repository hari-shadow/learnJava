package Recursions.Easy;

public class CountSteps {
    public static void main(String[] args) {
        steps(8);
        System.out.println(count);
    }
    static int count = 0;
    private static void steps(int n) {
        if (n ==0){
            return ;
        }
        if ((n & 1) ==0){
            count++;
            steps(n /2);
        }
        else{
            count++;
            steps(n-1);
        }

    }
}

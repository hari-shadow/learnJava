package Zoho2ndRound;

import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] arr = {120,24,71,10,59};
        System.out.println(Arrays.toString(solve(arr)));
    }
    static int[] solve(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.max(multiplyOfDigits(arr[i]), addOfDigits(arr[i]));
        }

        return arr;
    }

    static int multiplyOfDigits(int n){
        int temp =1;
        while (n >0){
            temp = temp*(n%10);
            n = n/10;
        }
        return temp;
    }
    static int addOfDigits(int n){
        int temp =0;
        while (n >0){
            temp = temp+(n%10);
            n = n/10;
        }
        return temp;
    }
}

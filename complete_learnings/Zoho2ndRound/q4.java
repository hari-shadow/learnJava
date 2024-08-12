package Zoho2ndRound;

import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(alternateSorting(arr)));
    }
    static int[] alternateSorting(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i%2 ==0){
                ans[i] = arr[end];
                end--;
            }
            else {
                ans[i] = arr[start];
                start++;
            }
        }
        return ans;
    }
}

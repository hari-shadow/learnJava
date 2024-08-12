package Zoho2ndRound;

import java.util.Arrays;
public class q10 {
    public static void main(String[] args) {
        int[] arr = {2,2,0,4,0,8};

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i+1 < n && (arr[i] == arr[i+1])){
                arr[i] *= 2;
                arr[i+1] = 0;
            }
        }

        int count =0;

        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }

        }
        while (count < n){
            arr[count++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}

package Zoho2ndRound;

import java.util.Arrays;

public class q11 {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,1,2};

        int n = arr.length;
        int maxRitght = arr[n-1];
        arr[n -1] = -1;
        for (int i = n -2; i >=0 ; i--) {
            int temp = arr[i];
            arr[i] = maxRitght;
            maxRitght = Math.max(temp, arr[i]);
        }

        System.out.println(Arrays.toString(arr));

    }
}

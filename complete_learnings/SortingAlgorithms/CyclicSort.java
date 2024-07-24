package SortingAlgorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,7,8,9};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr ){
        int i = 0;
        while ( i < arr.length){
            if (arr[i] == i +1){
                i++;
            }else{
                swap(arr,arr[i], i);
            }
        }
    }
    static void swap(int[] arr,int t1, int t2){
        int temp = arr[t1-1];
        arr[t1 -1] = arr[t2];
        arr[t2] = temp;
    }
}

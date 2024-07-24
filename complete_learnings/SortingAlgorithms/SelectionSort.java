package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-23,-25,0,456,645,3,66,-45345};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = minElementIndex(arr, i,arr.length-1);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }
    static int minElementIndex(int[] arr, int start,int end){
        int index = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }

}

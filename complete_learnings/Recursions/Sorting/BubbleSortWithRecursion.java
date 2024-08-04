package Recursions.Sorting;

import java.util.Arrays;

public class BubbleSortWithRecursion {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,544,2,23};
        bubbleSort(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
                bubbleSort(arr,row,++col);
//            else {
//                bubbleSort(arr, row, ++col);
//            }
        }
        else {
            bubbleSort(arr, row-1, 0);
        }
    }
}

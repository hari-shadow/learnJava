package Recursions.Sorting;

import java.util.Arrays;

public class SelectionSortWithRecursion {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,544,2,23};
        selectionSort(arr,arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int row, int col , int index){
        if (row == 0){
            return;
        }
        if (col < row){
            if(arr[col] > arr[index]){
                index = col;
            }
            selectionSort(arr,row,++col,index);
//            else {
//                bubbleSort(arr, row, ++col);
//            }
        }
        else {
            int temp = arr[row];
            arr[row] = arr[index];
            arr[index] = temp;

            selectionSort(arr, row-1, 0,0);
        }
    }
}

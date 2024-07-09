package ArraysLearning;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 3, 3, 6, 7, 83};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }


}


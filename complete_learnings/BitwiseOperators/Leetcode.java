package BitwiseOperators;

import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);
        for (int[] arr : image){
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
    }

    static void flipAndInvertImage(int[][] image) {

        for (int[] ints : image) {
            reversing(ints);
        }

    }
    static void reversing(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            swap(start, end, arr);
            start++;
            end --;
        }
    }

    static void swap (int a , int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b] ^ 1;
        arr[b] = temp ^ 1;
    }
}

package BinarySearchOn2DArray;

import java.util.Arrays;

public class BinaryOn2D {
    public static void main(String[] args) {
        int[][] arr2D = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
//        int[][] arr2D = {
//            {10,20,30},
//            {11,21,31},
//            {12,22,32}
//        };
        int target = 1;
        System.out.println(Arrays.toString(search(arr2D, target)));
    }
    static int[] search(int[][] arr2D, int target){
        int start = 0;
        int end = arr2D.length -1;
        while (start< arr2D.length && end >=0){
            if (arr2D[start][end]== target){
                return new int []{start, end };
            }
            if (arr2D[start][end] < target){
                start ++;
            }
            else{
                end --;
            }
        }
        return new int[]{-1,-1};
    }
}

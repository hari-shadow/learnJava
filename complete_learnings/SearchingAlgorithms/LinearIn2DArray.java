package SearchingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearIn2DArray {
    public static void main(String[] args) {
        int target = 0;
        int[][] arr2D;
        arr2D = new int[][]{
                {1, 45, 75, 8, 4},
                {3, 4, 657, 3},
                {343, 56, 67, 1, 0}

        };
//        int[] ans = linearSearchIn2DArray(arr2D,target);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(minimumIn2DArray(arr2D));
        linearSearchIn2DArrayIndex(arr2D, target);
        System.out.println(arrayList);
    }

    static int[] linearSearchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1};
    }

    static int minimumIn2DArray(int[][] arr) {
        int min = arr[0][0];
        for (int[] row : arr) {
            for (int col : row) {
                min = (min > col) ? col : min;

            }
        }
        return min;
    }

    static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

    static void linearSearchIn2DArrayIndex(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    ArrayList<Integer> indices = new ArrayList<>();
                    indices.add(row);
                    indices.add(col);
                    arrayList.add(indices);
                }
            }

        }


    }
}

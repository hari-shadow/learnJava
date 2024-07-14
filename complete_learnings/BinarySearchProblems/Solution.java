package BinarySearchProblems;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 3}, {2, 0}, {5, 10}, {6, -10}};
        int k = 1;
        System.out.println(findMaxValueOfEquation(points, k));
    }

    static int findMaxValueOfEquation(int[][] points, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 1; j < points.length - i; j++) {
                if (Math.abs(points[i][0] - points[j + i][0]) <= k) {
                    int eqn = points[i][1] + points[i + j][1] + Math.abs(points[i][0] - points[i + j][0]);
                    arr.add(eqn);
                }
            }
        }
        int max = Integer.MIN_VALUE;

        for (int a : arr) {
            max = Math.max(a, max);
        }
        return max;

    }
}


package LeetcodeProblems;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    static int[] twoSum(int[] arr, int target) {
        int start = 1;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            for (int i = 1; i < end; i++) {
                int temp = isTrue(arr, i, end, target);
                if (temp != -1) {
                    return new int[]{i, temp};
                }
            }

        }
        return new int[]{-1, -1};
    }

    static int isTrue(int[] arr, int start, int end, int target) {

        for (int i = start; i < end; i++) {
            if (i < end && arr[i] + arr[i + 1] == target) {
                return i + 1;
            }
        }
        return -1;
    }
}

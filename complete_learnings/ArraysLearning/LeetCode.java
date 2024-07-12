package ArraysLearning;

import java.util.Arrays;

public class LeetCode {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int count = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = count + nums[i];
            count = count + nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}

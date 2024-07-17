package BinarySearchProblems;

public class just {
    public static int findMax(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // If the array is not rotated (the largest element is at the end)
        if (nums[left] < nums[right]) {
            return nums[right];
        }

        // Binary search way
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1; // Maximum must be in the right half
            } else {
                right = mid; // Maximum could be the mid or in the left half
            }
        }

        return right;
    }

    public static void main(String[] args) {
        int[] nums = {15, 18, 19, 30, 56, 2, 3, 6, 12};
        System.out.println("The maximum element is: " + findMax(nums)); // Output: 56
    }
}

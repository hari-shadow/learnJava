package BinarySearchProblems;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 2, 5, 10, 8};
        System.out.println(splitArray(nums, 3));
    }

    static int splitArray(int[] nums, int k) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int n : nums) {
            start = Math.max(start, n);
            end = end + n;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = loop(nums, sum, 1, mid);

            if (pieces <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int loop(int[] nums, int sum, int pieces, int mid) {
        for (int element : nums) {
            if (sum + element <= mid) {
                sum = sum + element;
            } else {
                pieces++;
                sum = element;
            }
        }
        return pieces;
    }
}

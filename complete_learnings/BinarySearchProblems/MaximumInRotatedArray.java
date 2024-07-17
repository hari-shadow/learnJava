package BinarySearchProblems;

public class MaximumInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {15, 18, 19, 30, 56, 2, 3, 6, 12};
        System.out.println(pivot(arr));
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            return end;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[start]) {
                start = mid;
            } else {

                end = mid - 1;
            }
        }
        return start;
    }
}

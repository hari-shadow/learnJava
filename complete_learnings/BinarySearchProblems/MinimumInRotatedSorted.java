package BinarySearchProblems;

public class MinimumInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {15, 44, 56, 66, 67, 68, 88, 875, 2, 3, 6, 12};
        System.out.println(pivot(arr));
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            return start;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}

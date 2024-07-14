package BinarySearchProblems;

public class CeilNumberInBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 8, 9, 10, 12, 17, 23};
        int target = 40;
        System.out.println(ceilNum(arr, target));

    }

    static int ceilNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];

            }
            if (target > arr[mid]) {
                start = mid + 1;

            }
            if (target < arr[mid]) {
                end = mid - 1;

            }
        }
        return arr[start];
    }


}

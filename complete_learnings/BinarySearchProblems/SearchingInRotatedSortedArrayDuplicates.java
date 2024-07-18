package BinarySearchProblems;

public class SearchingInRotatedSortedArrayDuplicates {
    public static void main(String[] args) {
//        int[] arr = new int[]{7,8,1,2,3,3,3,4,5,6};
        int[] arr = new int[]{3, 3, 4, 5, 6, 3, 3, 3};
//        int[] arr = new int[]{4,6,7,8,77,77,1,2,3,44};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {

                return mid;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            }

            if (arr[mid] < arr[end]) {
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

package SearchingAlgorithms;

public class BinarySearchAlgo {
    public static void main(String[] args) {
//        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 4, 4, 3, 2, 1, 0, 0};
        int target = 4;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0; // we only need the index of the found element ;
        int end = arr.length - 1;
        boolean ascOrder = arr[start] <= arr[end];
        if (ascOrder) { // if the array is in the ascending order

            for (int i = start; i <= end; ) {
                int mid = start + (end - start) / 2; // (start + end )/2 can become a large number that the int cannot handle;
                if (target == arr[mid]) {
                    return mid;
                }
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                if (target < arr[mid]) {
                    end = mid - 1;
                }

            }
        } else { // if the array is in the descending order
            for (int i = start; i <= end; ) {
                int mid = start + (end - start) / 2; // (start + end )/2 can become a large number that the int cannot handle;
                if (target == arr[mid]) {
                    return mid;
                }
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                if (target > arr[mid]) {
                    end = mid - 1;
                }

            }
        }
        return -1;

    }
}

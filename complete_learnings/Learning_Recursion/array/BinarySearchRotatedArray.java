package array;

public class BinarySearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(search(arr, 9, 0, arr.length-1));      
    }

    static int search(int[] arr , int target, int start, int end){
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, target, start, --mid);
            }else{
                return search(arr, target, ++mid, end);
            }

        }else{
            if (arr[mid] <= target && target <= arr[end]) {
                return search(arr, target, ++mid, end);
            }else{
                return search(arr, target, start, --mid);
            }
        }
    }
}

package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        System.out.println(search(arr, 0, arr.length-1, 6));
    }   
    static int search(int[] arr, int start , int end, int target){
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;

        if (arr[mid] == target) {
            return mid;
        }
        if ( arr[mid] > target){
            return search(arr, start, --mid, target);
        }
        
        return search(arr, ++mid, end, target);
    }
}

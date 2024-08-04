package Recursions.Arrays;

public class ElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int target = 11;
        int start = 0;
        int end = arr.length -1;
        System.out.println(find(arr,target, start, end));
    }
    static int find(int[] arr, int target,int start, int end){
        if (start> end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] > arr[start]){
            if (arr[start] <=target && target < arr[mid]){
                return find(arr, target, start, mid-1);
            }
            return find(arr,target, mid +1, end);
        }
        else {
            if(arr[mid] < target && target<= arr[end]){
                return find(arr, target, mid +1, end);
            }
            return find(arr, target, start, mid-1);
        }
    }
}
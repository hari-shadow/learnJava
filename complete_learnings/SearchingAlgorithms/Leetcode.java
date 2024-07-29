package SearchingAlgorithms;

public class Leetcode {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int target = 5;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            int foo = arr[mid] - (mid +1);
            if (foo < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }

        return start + target;
    }
}

package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        System.out.println(search(arr, 0, 5));
    }
    static int search(int[] arr, int index, int target){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, ++index, target);
    }

}

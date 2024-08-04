package Recursions.Arrays;

public class isArraySorted {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,0};
        int[] arr = {1,2,2,3};
        System.out.println(check2(arr, 0));
    }
    static boolean check(int[] arr, int start){
        if (start == arr.length -1){
            return true;
        }
        if (!(arr[start] < arr[start+1])){
            return false;
        }
        start++;
        return check(arr, start);

    }
//way 2
    static boolean check2(int[] arr, int start){
        if (start == arr.length -1){
            return true;
        }

        return (arr[start] <= arr[start+1]) && check2(arr, ++start);

    }

}

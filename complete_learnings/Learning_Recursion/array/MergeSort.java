package array;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,-7,4,1};
        int[] ans = separation(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] separation(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        int[] arr1 = separation(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = separation(Arrays.copyOfRange(arr, mid, arr.length)); // the end element is excluded in this function

        int[] ans = merging(arr1, arr2);

        return ans;
    }
    static int[] merging(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];
        int pointer1 = 0;
        int pointer2 = 0;
        for (int i = 0; i < ans.length; i++) {
            if (pointer1 < arr1.length && pointer2 < arr2.length) {
                if (arr1[pointer1] < arr2[pointer2]) {
                    ans[i] = arr1[pointer1];
                    pointer1++;
                }
                else{
                    ans[i] = arr2[pointer2];
                    pointer2++;
                }
            }
            else{
                if (pointer1 < arr1.length) {
                    ans[i] = arr1[pointer1];
                    pointer1++;
                }
                else{
                    ans[i] = arr2[pointer2];
                    pointer2++;
                }
            }
        }


        return ans;
    }
}

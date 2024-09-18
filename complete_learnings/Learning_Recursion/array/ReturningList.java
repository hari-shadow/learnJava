package array;

import java.util.ArrayList;

public class ReturningList {
    public static void main(String[] args) {
        int[] arr = {0,3,3,3,4,3};
        ArrayList<Integer> ans = search(arr, 3, arr.length-1);
        System.out.println(ans);

    }
    static ArrayList<Integer> search(int[] arr, int target, int index){
        if (index < 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();

        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = search(arr, target, --index);
        if (!ans.isEmpty()) {
            list.addAll(ans);
        }
        return list;
    }
}

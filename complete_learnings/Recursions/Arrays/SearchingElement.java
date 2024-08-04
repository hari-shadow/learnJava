package Recursions.Arrays;

import java.util.ArrayList;

public class SearchingElement {
    public static void main(String[] args) {
        int[] arr = {3,5,2,43,6,23,5};
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(find(arr,0, target));
        System.out.println(find2(arr, 0,target));
        System.out.println(find3(arr, 0,target,list));
    }

    static boolean find(int[] arr, int start, int target){
        if (start == arr.length ){
            return false;
        }

        return arr[start] == target || find(arr, ++start, target);
    }

    // for the index of the element using recursion
    static int find2 (int[] arr, int start, int target){
        if (start == arr.length){
            return -1;
        }

        if (arr[start] == target){
            return start;
        }
        return find2(arr, ++start, target);

    }

    static ArrayList<Integer> find3 (int[] arr, int start, int target , ArrayList<Integer> list){
        if (start == arr.length){
            return list;
        }
        if (arr[start] == target){
            list.add(start);
        }
        return find3(arr, ++start, target, list);

    }
}

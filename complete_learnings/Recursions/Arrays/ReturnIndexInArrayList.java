package Recursions.Arrays;

import java.util.ArrayList;

public class ReturnIndexInArrayList {
    public static void main(String[] args) {
        int[] arr = {3,5,2,43,6,23,5};
        int target = 5;
        System.out.println(find(arr, target, 0));
    }
    static ArrayList<Integer> find(int[] arr, int target, int start){
        if(start == arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> list= new ArrayList<>();
        if (arr[start] == target){
            list.add(start);
        }
        ArrayList<Integer> gettingList = find(arr, target, ++start);
        if (!(gettingList.isEmpty())){
            list.addAll(gettingList);
//            for (int el : gettingList){
//                list.add(el);
//            }
        }
        return list;
    }
}

package SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] linearArr = {1, 2, 3, 4, 5};
        int target = 4;
        System.out.println(linearArray(linearArr, target));
    }

    static boolean linearArray(int[] arr, int target) {
        if (arr.length == 0) {
            return false;

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return false;
            }


        }
        return false;
    }


}

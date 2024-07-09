package ArraysLearning;

public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 56, 3, 33};
        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            max = (max >arr[i])?max:arr[i];
//        }
        for (int j : arr) max = (j > max) ? j : max;
        return max;
    }
}

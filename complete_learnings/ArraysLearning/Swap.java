package ArraysLearning;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {1, 2, 4, 4, 6, 6};

        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));


        input.close();
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}


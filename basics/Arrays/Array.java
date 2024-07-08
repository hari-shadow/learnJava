package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }

//        for (int i=0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        for (String str : arr) {
//            System.out.print(str + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }


}

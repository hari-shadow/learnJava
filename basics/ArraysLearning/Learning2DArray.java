package ArraysLearning;

import java.util.Arrays;
import java.util.Scanner;

public class Learning2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }


        for (int[] row : arr) {
//            for (int col :row){
//                System.out.print(col+" ");
            System.out.println(Arrays.toString(row)); // this is enhanced;
//            }
//            System.out.println();
        }
        input.close();
    }


}


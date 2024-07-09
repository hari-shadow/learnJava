package ArraysLearning;

import java.util.Scanner;

public class LearnTheArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][];

        for (int row = 0; row < arr.length; row++) {

            for (int column = 0; column < arr[row].length; column++) {

                arr[row][column] = input.nextInt();
            }

        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        input.close();

    }
}

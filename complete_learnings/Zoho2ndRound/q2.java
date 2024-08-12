package Zoho2ndRound;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,0,1,1},
                {0,0,0,1,1},
                {0,1,1,0,1},
                {0,1,0,1,1},
                {0,1,0,1,1},
        };
        booleanMat(arr);
        for(int[] arrInner : arr){

            System.out.println(Arrays.toString(arrInner));
        }
    }
    static void booleanMat(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1){
                    if(i - 1 >= 0){
                        arr[i-1][j] = 0;
                    }
                    if (i +1 < row){
                        arr[i+1][j] = 0;
                    }
                    if (j-1 >= 0){
                        arr[i][j-1] = 0;
                    }
                    if (j+1 < col){
                        arr[i][j+1] = 0;
                    }
                }
            }
        }
    }
}

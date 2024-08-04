package Recursions.Patterns;

public class DownPyramid {
    public static void main(String[] args) {
//        patternWithoutRecursion(5);
        patternWithRecursion(4,0);
    }

    /*

     * * * * *
     * * * *
     * * *
     * *
     *

     * */
    static void patternWithoutRecursion(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n -i; j > 0 ; j--) {
                System.out.print("*" +" ");
            }
                System.out.println();
        }
    }

    static void patternWithRecursion(int row , int col ){
        if (row == 0){
            return;
        }
        if (col < row){
            System.out.print("* ");
            patternWithRecursion(row, col +1);
        }
        else {
            System.out.println();
            patternWithRecursion(--row, 0);
        }


    }
}

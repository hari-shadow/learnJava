package array;

public class PatternPrinting {
    public static void main(String[] args) {
        print(4, 1);
    }
    static void print(int row, int column){
        if (row == 0) {
            return;
        }
        if (column <= row) {
            System.out.print("& ");
            print(row, ++column);
        }else{
            System.out.println();
            print(--row, 1);
        }
    }
}

package BitwiseOperators;

public class SetBits {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits2(n));
        System.out.println(setBits1(n));
    }
    static int setBits1(int n){ //solving way 1
        int count = 0;
        while ( n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
    static int setBits2(int n){ // solving way 2
        int count = 0;
        while (n > 0){
            count++;
            n = (n - (n& -n));

        }
        return count;
    }
}

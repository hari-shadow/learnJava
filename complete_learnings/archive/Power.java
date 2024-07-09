package archive;

public class Power {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int pow = 5;
        int i = 0;
        while (i < pow) {
            a *= n;
            i++;
        }
        System.out.println(a);
    }
}

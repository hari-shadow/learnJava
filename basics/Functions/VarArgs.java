package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varArgsFun(1, 45, 4, 4, 3, 42, 35, 534, 5, 5, 433, 23, 55, 44);

        varstring(1, 3, "hari", "nari");
    }

    static void varArgsFun(int a, int b, int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void varstring(int a, int b, String... c) {
        System.out.println(Arrays.toString(c));
    }
}

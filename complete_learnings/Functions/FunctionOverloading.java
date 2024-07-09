package Functions;

import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println(fun(3, 5));
        System.out.println(fun("hari", "haran"));
    }

    static int fun(int a, int b) {
        return a + b;
    }

    static String fun(String a, String... b) {

//        return a + Arrays.toString(b);
        return a + b[0];
    }

}

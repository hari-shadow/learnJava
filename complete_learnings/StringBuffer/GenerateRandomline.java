package StringBuffer;

import java.util.Random;

public class GenerateRandomline {
    public static void main(String[] args) {
        Random random = new Random();

        int n = 57;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {

            sb.append(((char)('a' + (int)(26* random.nextFloat()))));
        }
        System.out.println(sb);
    }
}

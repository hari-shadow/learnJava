package StringBuffer;

import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int n = 7;
        System.out.println((int) (n * random.nextFloat()));

    }
}

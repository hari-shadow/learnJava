package archive;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        while (true) {
            int ip = input.nextInt();
            if (ip == 0) {

                break;
            } else {
                a = (ip > a) ? ip : a;
            }
        }
        System.out.println(a);
        input.close();
    }
}

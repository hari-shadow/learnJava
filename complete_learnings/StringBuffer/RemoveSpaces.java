package StringBuffer;

import java.util.Scanner;
public class RemoveSpaces  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        System.out.println(str.replaceAll(" ",""));




    }

}

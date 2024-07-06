package archive;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ip = input.next();
/*
        switch (ip){
            case "hari"-> {
                System.out.println(5);
                System.out.println("hari");
            }
            case "nari"-> {
                System.out.println("nari");
                System.out.println("nari1");
            }

            default -> System.out.println("default");
        }
*/


        switch (ip) {
            case "hari", "nari", "pari" -> System.out.println("work");
            default -> System.out.println("this is default");
        }
    }
}

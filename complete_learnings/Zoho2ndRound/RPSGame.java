package Zoho2ndRound;

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        String[] dataArr = {"r", "p", "s"};

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        while (true) {

            String sysGenerated = dataArr[random.nextInt(3)];

            System.out.print("Enter your move (r / p / s) : ");
            String userInput = scanner.nextLine();

            System.out.println("system generated :" + sysGenerated);

            if (userInput.equals(sysGenerated)) {
                System.out.println("Tie");
            }
            if (userInput.equals("p")) {
                if (sysGenerated.equals("s")) {
                    System.out.println("you lose");
                }
                if (sysGenerated.equals("r")) {
                    System.out.println("you win");
                }
            }
            if (userInput.equals("r")) {
                if (sysGenerated.equals("p")) {
                    System.out.println("you lose");
                }
                if (sysGenerated.equals("s")) {
                    System.out.println("you win");
                }
            }
            if (userInput.equals("s")) {
                if (sysGenerated.equals("r")) {
                    System.out.println("you lose");
                }
                if (sysGenerated.equals("p")) {
                    System.out.println("you win");
                }
            }

            System.out.print("want to play again (y/n) :");
            String yesNo = scanner.nextLine();

            if (yesNo.equals("n")) {
                break;
            }
        }
        scanner.close();

    }
}

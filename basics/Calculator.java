import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while(true){

            System.out.print("Enter a character to do the operation : ");

            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' ||op == '/' || op == '%') {

                System.out.print("enter two numbers : ");
                int n1 = input.nextInt();
                int n2 = input.nextInt();

                if (op == '+') {
                    System.out.println(n1+n2);
                }if (op == '-') {
                    System.out.println(n1-n2);
                }if (op == '*') {
                    System.out.println(n1*n2);
                }if (op == '/') {
                    if (n2!= 0){
                        System.out.println(n1/n2);
                    }
                    else
                    {
                        System.out.println("the denominator cannot be 0");
                    }

                }if (op == '%') {
                    System.out.println(n1%n2);
                }

            }
            if (op == 'x'|| op == 'X') {
                break;
            }
        }
    }
}

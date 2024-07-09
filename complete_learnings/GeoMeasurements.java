import java.util.Scanner;

public class GeoMeasurements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hi, welcome to Geometric Measurements");
        System.out.println("Please choose any one of the options below :");
        System.out.println("1. Volume");
        System.out.println("2. Perimeter");
        System.out.println("3. Area");
        System.out.print("Options :");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("To Find the Volume of : ");
            System.out.println("1. Volume of Circle");
            System.out.println("2. Volume of Square");
            System.out.println("3. Volume of triangle");

            System.out.print(" Option : ");
            int volOption = input.nextInt();

            if (volOption == 1) {
                System.out.println("Enter Radius : ");
                float radius = input.nextFloat();
                System.out.println((4.0 / 3) * (Math.pow(radius, 3)) / 3);
            }
        }
        if (option == 2) {
            System.out.println("To Find the Perimeter of : ");
            System.out.println("1. Perimeter of Circle");
            System.out.println("2. Perimeter of Square");
            System.out.println("3. Perimeter of triangle");

            System.out.print(" Option : ");
            int perOption = input.nextInt();

        }
        if (option == 1) {
            System.out.println("To Find the Area of : ");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Square");
            System.out.println("3. Area of triangle");

            System.out.print(" Option : ");
            int areaOption = input.nextInt();

        }
    }

}

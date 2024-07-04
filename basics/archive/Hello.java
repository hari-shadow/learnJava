import java.io.*;
import java.util.Scanner;
public class Hello{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter n1: ");
	float n1 = input.nextFloat();
	System.out.print("Enter n2 : ");
	float n2 = input.nextFloat();
	float max = (n1>n2)?n1:n2;
	System.out.println("The largest number is "+max);
	input.close();

	
	
	}
}

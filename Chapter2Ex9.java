//Import Scanner class to be used
import java.util.Scanner;

public class Chapter2Ex9{
	public static void main(String[] args){

		//Create a Scanner object
		Scanner keyboard = new Scanner(System.in);

		//Let's get Name from the keyboard and do the printing
		System.out.println("Please enter your first name");
		String firstName = keyboard.next();
		System.out.println("Your first name is " + firstName);

		//If you need to grab more than 1 word: use nextLine() method

		//Let's get 2 integer values and print the total
		System.out.println("Please enter your first integer value");
		int value1 = keyboard.nextInt();
		System.out.println("Please enter your second integer value");
		int value2 = keyboard.nextInt();
		System.out.println("The total is " + (value1 + value2));

		//If you need to grab a double value: use nextDouble() method
		}
	}
import java.util.Scanner;

public class Chapter4Ex2{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your hourly wage");
		double rate = keyboard.nextDouble();

		//Assume that the value is any number between $7.25 to $75

		while( rate < 7.25 || rate > 75) {
			System.out.println("Your entry was invalid");
			System.out.println("Please re-enter your hourly wage");
			rate = keyboard.nextDouble();
		}
			System.out.println("You are earning $" + rate +" dollars from your job each hour");
		}
	}
























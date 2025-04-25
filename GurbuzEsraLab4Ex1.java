/*******************************************************************
@Title:	    GurbuzEsraAlgorithmandProgramming
@Purpose:	I have verified the tip percentage, total check, and executed the tip amount function in Textpad
@Author:    Gurbuz & Esra
@Date:   	10.11.2024 | 10th of November 2024
@Version:	1.0
********************************************************************/


import java.util.Scanner;

public class GurbuzEsraLab4Ex1{
	public static void main(String[] args){

		//tipAmount = check * percentage / 100
		//check = amount of the check
		//percentage = tip percentage
		//tipAmount = calculated tip amount

		//%15 > tip it is below the standards
		//%25 < tip They are being generous

		//Printf to rounf the floating-point number to two decimal places

		Scanner keyboard = new Scanner(System.in);

		//check

		System.out.println("Enter the check amount: ");

		double num1 = keyboard.nextDouble();

		System.out.printf("check: %.2f\n", num1);

		//tip percentage

		System.out.println("What percentage tip would you like to give? (0 - 100)");

		int num2 = keyboard.nextInt();

		System.out.printf("Tip: %d\n", num2);

		if (num2 > 100 && num2 < 0) {
		    System.out.println("Invalid percentage. Exiting program.");
		    return;
			}

		//tip amount

		double tipAmount = num1 * (double) num2 / 100;

		System.out.printf("tip amount: %.2f\n", tipAmount);

		if(num2 < 15) {
			System.out.println("It's below the standards.");
			}
		else if(num2 > 25) {
			System.out.println("You are generous!");
			}
		else {
			System.out.println("Thank you!");
			}
	}
}
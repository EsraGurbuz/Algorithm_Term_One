/*******************************************************************
@Title:	    GurbuzEsraAlgorithmandProgramming
@Purpose:	I have verified the total cost, adding ingredients, and executed function in Textpad
@Author:    Gurbuz & Esra
@Date:   	10.11.2024 | 10th of November 2024
@Version:	1.0
********************************************************************/
import java.util.Scanner;

public class GurbuzEsraLab4Ex2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String v = "cheese pizza";
		System.out.println("You want to eat a " + v);
		System.out.println("Do you want to add something to pizza? ");
		System.out.println("Please say Yes or No (Y/N).");
		String v2 = keyboard.next();
		double totalCost = 6;
		if (v2.equals("Y")) {
			System.out.println("How many ingredients do you want? ");
			int e1 = keyboard.nextInt();

			if (e1 == 1) {
				totalCost = 6 + e1 * 2;
		    } else if (e1 >= 2) {
				totalCost = 6 + e1 * 1.5;
			}
		} else {
			System.out.println("Okay!");
			}
			double newTotalCost = totalCost;
			if ( totalCost >= 10 ) {
				newTotalCost = totalCost - totalCost * 5 /100;
			}
		System.out.printf("Your cost is %.2f.\n", newTotalCost);
	}
}
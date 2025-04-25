import java.util.Scanner;

public class Chapter5Ex4{

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first value");
		int value1 = keyboard.nextInt();
		System.out.println("Please enter the second value");
		int value2 = keyboard.nextInt();

		displayTotal(value1, value2);
	}

	/**displayTotal is void type of method that will print the total of two integer values
	@paraam1 x is holding the first value
	@pasram2 y is holding the second value
	*/

	public static void displayTotal(int x, int y){
		System.out.println("The total is " + (x + y));
	}


}










import java.util.Scanner;

public class Chapter5Ex5{

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
				System.out.println("Please enter the first value");
				int value1 = keyboard.nextInt();
				System.out.println("Please enter the second value");
				int value2 = keyboard.nextInt();

				int totalValue = displayTotal(value1, value2);
					System.out.println("The total value is " + totalValue);
			}

			/**displayTotal is void type of method that will calculate total of two integer values
			and return the result back to the main method
			@paraam1 x is holding the first value
			@pasram2 y is holding the second value
			@return total
			*/

			public static int displayTotal(int x, int y){
				int total = x + y;
				return total;
			}


		}


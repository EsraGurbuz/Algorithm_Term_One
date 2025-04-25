import java.util.Scanner;

public class Chapter4Ex3{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String firstName, lastName;
		int conditionCheck;
		boolean status = true;

		do{
			System.out.println("Please etner your first name");
			firstName = keyboard.next();
			System.out.println("Please etner your last name");
			lastName = keyboard.next();
			System.out.println("Your full name is " + firstName + " " + lastName);
			System.out.println("Do you want to continue? Press 1 to continue , 2 to end");
			conditionCheck = keyboard.nextInt();
			if(conditionCheck == 2) {
				status = false;
			}
		} while(status == true);

	}
}
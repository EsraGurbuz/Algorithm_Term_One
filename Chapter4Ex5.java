import java.util.Scanner;

public class Chapter4Ex5{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many grades are you going to enter?");
		int input = keyboard.nextInt();
		int grade;
		int total = 0; //accumulator

		for(int i = 1; i <= input; i++) {
			System.out.println("Enter your grade");
			grade = keyboard.nextInt();
			total = total + grade;
		}
		int average = total / input;
		System.out.println("Your average grade is " + average);
	}
}
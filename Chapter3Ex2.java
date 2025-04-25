public class Chapter3Ex2{
	public static void main(String[] args){

		int grade = 120;

		if (grade < 60 && grade >= 0) {
			System.out.println("You failed");
		}
		else if (grade >= 60 && grade <= 100) {
			System.out.println("Congrats! You deserved this success");
		}
		else {
			System.out.println("You entry is invalid");
		}
	}
}

import java.util.Random;

public class Chapter5Ex6{
	public static void main(String[] args) {

		//Create a Randomobject
		Random myRandomNo = new Random();
		int value = myRandomNo.nextInt(10);
		System.out.println("my Random number is " + value);

	}
}

public class Chapter4Ex4{
	public static void main(String[] args) {

		//Iwant to print every integer from 0 to 100.

		for(int x = 0; x <= 100 ; x++) {
			System.out.println(x);
		}

		//If you want to print every integer from 40 to 10.
		for(int z = 40; z >= 10; z--){
			System.out.println("Z value is " + z);
		}

		for ( int i = 0, y = 5; i < 3 && y > 3; i =+2, y--){
				System.out.println("i value is " + i);
				System.out.println("y value is " + y);
		}
	}
}
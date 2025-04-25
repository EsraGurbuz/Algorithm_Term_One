public class Chapter5Ex3{

	public static void main(String[] args){

		int x = 10;
		System.out.println("The value of x is " + x);
		changeValue(x);
		System.out.println("The latest value of x in the main method " + x);
	}

	public static void changeValue (int x) {
		x = x + 1;
		System.out.println("The value of x in the changeVaalue method is " + x);
	}

}

public class Chapter7Ex1 {
	public static void main(String[] args) {
		int[] values = new int[10];
		values[0] = 10;
		values[2] = 5;
		values[5] = 12;
		values[9] = 20;

		System.out.println("First number " + values[0]);
		System.out.println("Second number " +values[1]);
		System.out.println("Third number " + values[2]);

		//Print all the array members
		for(int index = 0; index < 10; index++) {
			System.out.println(values[index]);
		}

	}
}
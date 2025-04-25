public class Chapter7Ex4 {
	public static void main (String[] args){
		int[] values = {3, 4, 8, 18, -5};

		//pass the 3rd member of the array
		displayValue(values[2]);
		//pass the whole array
		displayArray(values);


	}

	public static void displayValue(int x){
		System.out.println("Third member is " + x);
	}

	public static void displayArray(int[] numbers){
		for(int i = 0; i < numbers.length; i++){
			System.out.println("Array numbers are " + numbers[i]);
		}

	}
}
public class Chapter7Ex2 {
	public static void main(String[] args){
		int[] numbers = { 5 , 15, -5, 16, -4, 0, 3, 6, 10, 8, -2 };

		for(int i = 0; i <= 10; i++){
			System.out.println(numbers[i]);
		}

		//Printout 2nd option (safer)
		for(int j = 0; j < numbers.length; j++){
			System.out.println("Safer print " + numbers[j]);
		}
	}
}
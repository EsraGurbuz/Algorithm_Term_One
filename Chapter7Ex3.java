public class Chapter7Ex3 {
	public static void main (String[] args){
		int[] numbers1 = {5, 7, 9, 11};

		//Coping
		int[] numbers2 = new int[4];
		for(int i = 0; i < numbers2.length; i++){
			numbers2[i] = numbers1[i];
		}

		for(int j = 0; j < numbers2.length; j++){
			System.out.println("Mmebers of the numbers2 array " + numbers2[j]);
		}
	}
}
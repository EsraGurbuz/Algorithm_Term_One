public class Chapter7Ex5 {
	public static void main (String[] args) {
		int[] values = {3, 4, 8, 18, -5};

		//Find the highest
		int highest = values[0];
		for(int i = 1; i < values.length; i++){
			if(values[i] > highest){
				highest = values[i];
			}
		}
		System.out.println(highest);

		//Find the lowest
		int lowest = values[0];
		for(int j = 1; j < values.length; j++){
			if(values[j] < lowest){
				lowest = values[j];
			}
		}
		System.out.println(lowest);


		//Find the total and then the average
		int total = 0;
		for(int k = 0; k < values.length; k++) {
			total = total + values[k];
		}
		System.out.println("The total is " + total);
		System.out.println("The average is " + (total/values.length));
	}
}
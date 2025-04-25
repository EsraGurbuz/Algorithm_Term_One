public class Chapter7Ex7{
	public static void main(String[] args){

		int[][] values = { {1,5,-1}, {3,5,7}, {2,2,-2} };

		//Calculate the total for complete array
		int total = 0;
		for(int row = 0; row < 3; row++){
			for (int col = 0; col < 3; col++){
				total = total + values[row][col];
			}
		}
		System.out.println("The total is " + total);
	}
}

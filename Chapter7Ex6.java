public class Chapter7Ex6{
	public static void main(String[] args){
		int[][] numbers = {{1,5,7,4}, {2,4,6}, {3,8,4,9}};

		//Print the array members in a matrix format
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col < numbers[row].length; col++){
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}
	}
}
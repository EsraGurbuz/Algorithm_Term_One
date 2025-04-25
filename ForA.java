import java.util.Random;

public class ForA{
	public static void main(String[] args){

		Random myRandomNo = new Random();

		int[][] population = new int[4][6];

		int total = 0;
		for(int species = 0; species < 4; species++){
			for(int states = 0; states < 6; states++){
				int random = myRandomNo.nextInt(9);
				population[species][states] = random;
				System.out.print(population[species][states] + " ");

				total = total + population[3][states];
			}
			System.out.println();
		}
		System.out.println(total);

	}
}
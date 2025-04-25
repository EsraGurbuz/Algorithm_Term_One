import java.util.Random;

public class ForB{
	public static void main(String[] args){

		Random myRandomNo = new Random();

		int[][] population = new int[4][6];


		int total = 0;
		int typeTotal = 0;
		for(int species = 0; species < 4; species++){
			for(int states = 0; states < 6; states++){
				int random = myRandomNo.nextInt(11);
				population[species][states] = random;
				System.out.print(population[species][states] + " ");

				total = total + population[3][states];

			}
			System.out.println();
		}
		System.out.println("Last species has " + total + " total population in all 6 states.");

		for(int states = 0; states < 6; states++){
			typeTotal = 0;
			boolean[] types = new boolean[4];
			for(int species = 0; species < 4; species++){
				if(population[species][states] != 0){
					types[species] = true;
					typeTotal++;

				}
			}
			System.out.println((states+1) + " state has " + typeTotal + " differrent dog species.");
		}

	}
}
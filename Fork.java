import java.util.Random;

public class Fork{
	public static void main(String[] args){

		Random myRandomNo = new Random();

		int[][] population = new int[4][6];
		boolean[] endangeredSpecies = new boolean[4];


		int total = 0;
		int stateCount = 0;
		int typeCount = 0;
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
			stateCount = 0;

			for(int species = 0; species < 4; species++){
				if(population[species][states] != 0){

					stateCount++;
				}
			}
			System.out.println((states+1) + " states has " + stateCount + " different species.");
		}

		for(int species = 0; species < 4; species++){
			typeCount = 0;
			for(int states = 0; states < 6; states++){
				if(population[species][states] != 0){
					typeCount++;
				}
			}
			if(typeCount <= 3){
				endangeredSpecies[species] = true;
			}
		}

		for(int species = 0; species < 4; species++){
			if(endangeredSpecies[species]){
				System.out.println("Species " + (species + 1) + " is endangered.");
			}
		}
	}
}
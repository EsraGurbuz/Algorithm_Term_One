import java.util.Random;

public class Forx{
	public static void main(String[] args){

		Random myRandomNo = new Random();

		int[][] population = new int[4][6];
		int[] howManyState = new int[6];

		int total = 0;
		int typesTotal = 0;
		for(int species = 0; species < 4; species++){
			for(int states = 0; states < 6; states++){
				int random = myRandomNo.nextInt(9);
				population[species][states] = random;
				System.out.print(population[species][states] + " ");

				total = total + population[3][states];

				for(int col = 0; col < 6; col++){
					typesTotal = 0;
					for(int row = 0; row < 4; row++){
						if(population[species][states] != 0){
						typesTotal++;
						}
					}
				}
			}
			System.out.println();
		}
		System.out.println(total);
		for(int i = 0; i < howManyState.length; i++){
			howManyState[i] = typesTotal;
			System.out.println((i+1) + " types in " + howManyState[i] + " different state");
		}

	}
}
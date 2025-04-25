public class İlk{

	//for November 10th
	public static void november10th(){
		int[] tem10th = {45, 49, 53, 55, 60, 65, 70, 72, 68, 63, 58, 53};

		float[] newtem10th = new float[12];
		for(int i = 0; i < tem10th.length; i++){
			newtem10th[i] = (5.0f/9)*(tem10th[i]-32);
			System.out.printf("%.2f\n", newtem10th[i]);
		//for loop
		}
	//november 10th
	}

	//for calculate the average temperature
	public static void average10th(){
		int[] tem10th = {45, 49, 53, 55, 60, 65, 70, 72, 68, 63, 58, 53};

		double sum = 0;

		double[] newtem10th = new double[12];
		for(int j = 0; j < tem10th.length; j++){
			newtem10th[j] = (5.0/9)*(tem10th[j]-32);
			sum += newtem10th[j];
		//for loop
		}
		return sum/newtem10th.length;
	}

	//for calculate the total temperature variation
	public static void tottemvar10th(){
		int[] tem10th = {45, 49, 53, 55, 60, 65, 70, 72, 68, 63, 58, 53};
		double sum1 = 0;
		float[] newtem10th = new float[12];
		for(int l = 0; l < tem10th.length; l++){
			newtem10th[l] = (5.0f/9)*(tem10th[l]-32);
			System.out.println(newtem10th[l]);
			//calculate the total
			float[] totvar10th = new float[11];
			for(int k = 0; k < newtem10th.length; k++){
				totvar10th[k] = newtem10th[k+1] - newtem10th[k];
				sum1 = sum1 + totvar10th[k];
			}
		}
		System.out.println("The total temperature variation is " + sum1);
	}

	//a method for highest
	public static void highest(){
		int[] tem10th = {45, 49, 53, 55, 60, 65, 70, 72, 68, 63, 58, 53};
		double sum1 = 0;
		float[] newtem10th = new float[12];
		for(int i = 0; i < tem10th.length; i++){
			newtem10th[i] = (5.0f/9)*(tem10th[i]-32);
			System.out.println(newtem10th[i]);
			//calculate the total
			float[] totvar10th = new float[11];
			for(int k = 0; k < newtem10th.length; k++){
				totvar10th[k] = newtem10th[k+1] - newtem10th[k];
				if(totvar10th[k-1] < totvar10th[k]){
					double highest = totvar10th[k];
					System.out.println(highest);
				}
			}
		}

	}


	public static void main(String[] args){
		november10th();
		average10th();
		tottemvar10th();
		highest();
	}

//public class
}
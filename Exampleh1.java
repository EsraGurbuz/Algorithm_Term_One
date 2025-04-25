public class Exampleh1 {
	public static void main(String[] args) {
		factoriel(5);
		factoriel(6);
		factoriel(4);

	}

	public static int factoriel(int x){
		int factorielValue = 1;
		for(int i = 1; i <= x; i++){
			factorielValue = factorielValue*i;
		}
		System.out.println(factorielValue);
		return factorielValue;
	}
}
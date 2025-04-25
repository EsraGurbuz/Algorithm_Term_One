public class Chapter3Ex3{
	public static void main(String[] args){

		String name1 = "John";
		String name2 = "JOHN";

		if(name1 == name2) {
			System.out.println("They may be same");
		}
		if(name1.equalsIgnoreCase(name2)){
		//(name1.equals(name2)){
		//if(name1.compareTo(name2) == 0) {
			System.out.println("The names are same");
			}
		else {
			System.out.println("Different names");
			}
		}
	}
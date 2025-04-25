import java.util.ArrayList;

public class Chapter7Ex8 {
	public static void main(String[] args) {

		//Create an ArrayList
		ArrayList<String> names = new ArrayList<String>();

		names.add("John");
		names.add("Karon");
		names.add("Sharon");
		names.add("Sam");
		names.add("Mary");
		names.add("Mike");

		System.out.println(names);

		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		names.add(2, "Susan");
		names.set(1, "Karen");

		System.out.println(names);

		names.add("Jane");

		names.remove(6);

		System.out.println(names);

		//Here
		///Remove all the names that start with "S" in the list and print the final list.

		for(int i = 0; i < names.size(); i++) {
			String random = names.get(i);
			if(random.charAt(0) == 'S'){
				names.remove(i);
				i--;
			}
		}
		System.out.println(names);


	}
}
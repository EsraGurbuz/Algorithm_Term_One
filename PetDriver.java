public class PetDriver{
	public static void main(String[] args){

		//Create a Pet object (squirrel)
		Pet squirrel = new Pet();

		//I assign a value of Alvin to the name, 3 to the age, and tree to the location
		squirrel.setName("Alvin");
		squirrel.setAge(3);
		squirrel.setLocation("Christmas tree");

		//I print the name, age and location
		//Then the whole information about that.
		System.out.println(squirrel.getName());
		System.out.println(squirrel.getAge());
		System.out.println(squirrel.getLocation());
		System.out.println(squirrel.getCompleteInfo());

		//I want to a space
		System.out.println(" ");

		//I want to create another object without explanation(cat)
		Pet cat = new Pet();

		cat.setName("Cheshire");
		cat.setAge(12);
		cat.setLocation("Wonderland");

		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		System.out.println(cat.getLocation());
		System.out.println(cat.getCompleteInfo());

	}
}
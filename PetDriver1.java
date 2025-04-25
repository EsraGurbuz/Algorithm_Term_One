public class PetDriver1{
	public static void main(String[] args){

		//Create a pet object(squirrel)
		Pet1 squirrel = new Pet1();

		squirrel.setName("Alvin");
		squirrel.setAge(3);
		squirrel.setLocation("Tree");

		System.out.println(squirrel.getName());
		System.out.println(squirrel.getAge());
		System.out.println(squirrel.getLocation());

	}
}
public class Chapter2Ex8 {
	public static void main (String[] args) {
		String firstName = "John";
		String lastName = "Doe";

		System.out.println("First Name is " + firstName);
		System.out.println("Last Name is " + lastName);
		System.out.println("Full Name is " + firstName + " " + lastName);

		/*Built-in String Methods
		Find the number of characters in the string*/
		int charLength = firstName.length();
		System.out.println("The first name has " + charLength + "characters");

		//Print the specific character to screen
		System.out.println("The 3rd character of the first name is " + firstName.charAt(2));

		//Print the complete name in all uppercase letters
		System.out.println("The FIRST NAME is " + firstName.toUpperCase());

		//Print the complete name in all lowercase letters
		System.out.println("The FIRST NAME is " + firstName.toLowerCase());

		}
	}
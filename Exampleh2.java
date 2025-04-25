public class Exampleh2 {

	public static String toUpperCase(Student student){
		 return student.getName().toUpperCase();
	}

	public static void main(String[] args) {

		Student student1 = new Student("Kerem");
		Student student2 = new Student("Esra");
		Student student3 = new Student("Eren");

		String uppercaseName1 = toUpperCase(student1);
		String uppercaseName2 = toUpperCase(student2);
		String uppercaseName3 = toUpperCase(student3);

		System.out.println(uppercaseName1);
		System.out.println(uppercaseName2);
		System.out.println(uppercaseName3);
	}
}
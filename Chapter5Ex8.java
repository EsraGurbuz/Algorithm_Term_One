import java.io.*;
import java.util.Scanner;


public class Chapter5Ex8{
	public static void main(String[] args) throws IOException {
		//Open the file
		File myFile = new File("abc.txt");
		Scanner inputFile = new Scanner(myFile);
		String names;

		while(inputFile.hasNext()) {
			names = inputFile.next();
			int a = inputFile.nextInt();
			System.out.println(names);
		}

		inputFile.close();

	}
}
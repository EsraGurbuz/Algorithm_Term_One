import java.io.*;
import java.util.Scanner;

public class Admissions {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        // Students information documents
        System.out.println("Enter a name for students exam information document: ");
        String infoFileName = keyboard.nextLine();
        information(infoFileName);

        // Admissions result documents
        System.out.println("Enter a name for admissions results document: ");
        String resultFileName = keyboard.nextLine();

        PrintWriter resultFile = new PrintWriter(resultFileName);
        resultFile.println("Admissions Results Document Created!");
        resultFile.close();

        System.out.println("Results document is created.");
    }
}
	//I create information file
		public static void information(String infoFileName) throws IOException {

		PrintWriter outputFile = new PrintWriter(infoFileName);

		outputFile.println("Rafael Nadal 30 1600");
		outputFile.println("Mike Tyson 24 1230");
		outputFile.println("Frank Sinatra 16 1000");
		outputFile.println("Van Gogh 26 700");
		outputFile.println("Mad Hatter 29 1599");
		outputFile.println("Charles Leclerc 27 800");
		outputFile.println("Sabahattin Ali 20 1000");
		outputFile.close();

		System.out.println("Information document is created. ");

	}



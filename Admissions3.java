import java.io.*;
import java.util.Scanner;

public class Admissions3 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        // Students information documents
        System.out.println("Enter a name for students exam information document: ");
        String infoFileName = keyboard.nextLine();
        information(infoFileName);

        // Admissions reslt documents
        System.out.println("Enter a name for admissions results document: ");
        String resultFileName = keyboard.nextLine();

        PrintWriter resultFile = new PrintWriter(resultFileName);
        resultFile.println("Admissions results document");
        resultFile.close();

        System.out.println("Results document is created.");

        checkTheStatement(infoFileName, resultFileName);
    }

    // I create information file
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

        System.out.println("Information document is created.");
    }

	// identification and matching
	public static void checkTheStatement(String infoFileName, String resultFileName) throws IOException {
		Scanner inputFile = new Scanner(new File(infoFileName));
		PrintWriter outputFile = new PrintWriter(resultFileName);

			while (inputFile.hasNextLine()) {
				String line = inputFile.nextLine();
				String[] chain = line.split(" ");
				String firstName = chain[0];
				String lastName = chain[1];
				int actScore = Integer.parseInt(chain[2]);
				int satScore = Integer.parseInt(chain[3]);

				boolean actValid = validAct(actScore);
				boolean satValid = validSat(satScore);
				boolean actMet = metAct(actScore);
				boolean satMet = metSat(satScore);
				boolean admitted = admitted(actMet, satMet);

				outputStatus(admitted, actMet, satMet, firstName, lastName, outputFile);

			}

			inputFile.close();
			outputFile.close();
	}

	// validation of act score
	public static boolean validAct(int score) {
		return score >= 0 && score <= 30;
	}

	// validation of sat score
	public static boolean validSat(int score) {
		return score >= 0 && score <= 1600;
	}

	// check act minimum
	public static boolean metAct(int score) {
		return score >= 20;
	}

	// check sat minimum
	public static boolean metSat(int score) {
		return score >= 1000;
	}

	// check admitted or not admitted
	public static boolean admitted(boolean actMet, boolean satMet) {
		return actMet || satMet;
	}

	public static void outputStatus (boolean isAdmitted, boolean actMet, boolean satMet,  String firstName, String lastName, PrintWriter outputFile) {
		if (isAdmitted) {
			if ( actMet && satMet ) {
				outputFile.println(firstName + " " + lastName + " is admitted on ACT and SAT scores.");
			} else if ( actMet ) {
				outputFile.println(firstName + " " + lastName + " is admitted on ACT score.");
			} else {
				outputFile.println(firstName + " " + lastName + " is admitted on SAT score.");
			}
	 	} else {
		 	outputFile.println(firstName + " " + lastName + " is not admitted (ACT and SAT scores are below minimum)");
	 	}
 	}
}
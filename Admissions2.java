import java.io.*;
import java.util.Scanner;

public class Admissions2 {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the name of the document which the information will be written: ");
		String informationFileName = scanner.NextLine();
		System.out.println("Enter the name of the document which the result will be seen: ");
		String outputFileName = scanner.NextLine();

		PrintWriter outputFile = new printwriter(informationFileName);
		PrintWriter outputFile = new printwriter(outputFileName);



	}
}

	//input values
	public static void name(String informatinFileName ) throws IOException{
		outputFile.println("Rafael Nadal 30 1600");
		outputFile.println("Mike Tyson 24 1230");
		outputFile.println("Frank Sinatra 16 1000");
		outputFile.println("Van Gogh 26 700");
		outputFile.println("Mad Hatter 29 1599");
		outputFile.println("Charles Leclerc 27 800");
		outputFile.println("Sabahattin Ali 20 1000");

	}


	//act value
	public static int validAct(int act) {
		if( act > 20 && act < 30 ) {
			status == true;
		}else ( act > 0 && act < 20 ) {
			status == false;
		}
	}

	//sat value
	public static int validSat (int sat)  {
		if ( sat >= 1000 && sat <= 1600 ) {
			status == true;
		} else ( sat > 0 && sat < 1000 ) {
			status == false;
		}
	}

	public static int metAct (int act) {


import java.io.*;
import java.util.Scanner;

public class Chapter5Ex7{
	public static void main(String[] args) throws IOException {

		PrintWriter outputFile = new PrintWriter("abc.txt");

		outputFile.println("John");
		outputFile.println("Jenny");

		outputFile.close();


	}
}

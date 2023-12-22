package fileRead;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIOTemplate {

	public static void main(String[] args) {
		
		int someVariable = 0;
		
		try (Scanner fileScanner = new Scanner(Paths.get("file.txt"))) {
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				someVariable += Integer.valueOf(line);
			}
			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		
		try (PrintWriter output = new PrintWriter("output.txt")) {
			output.println("hello world!");
			output.println("An integer: " + 19873);
			output.println(7.9);
			output.println(true);
			output.println(someVariable);
			// this variable is a sum of 1, 2, 3, 4, 5
			output.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}

	}

}

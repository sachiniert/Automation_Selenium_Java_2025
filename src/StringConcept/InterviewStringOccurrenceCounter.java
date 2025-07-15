package StringConcept;

import java.util.Scanner;

public class InterviewStringOccurrenceCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input main string 
		System.out.print("Enter the main string");
		String mainString = scanner.nextLine();
		
		// Input word to count
        System.out.print("Enter the word to count: ");
        String wordToFind = scanner.nextLine();

        int count = 0;
        int index = 0;

        // Loop through the main string to count occurrences
        while ((index = mainString.indexOf(wordToFind, index)) != -1) {
            count++;
            index = index + wordToFind.length(); // Move index forward to avoid overlapping count
        }

        System.out.println("The word '" + wordToFind + "' occurred " + count + " times.");
        scanner.close();
		
		
		
		
		
		
		}

}

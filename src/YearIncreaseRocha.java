/* 
 * Erros in Pseudocode:
 * 
 * 	- Variable "year" wasn't initialized 
 * 	- The loop condition would never be true because: START_YEAR (2015) is not <= END_YEAR (30)
 * 	- I have created another variable for the "real" final year, which would
 * 		be 30 (END_YEAR) years from the initial "year" (finalYear = year + END_YEAR)
 * 	  Then I used the finalYear variable as the part of my loop condition: (year <= finalYear)
 */

import java.util.Scanner;

public class YearIncreaseRocha {

	public static void main(String[] args) {

		int year = 0;
		int finalYear = 0; 	// Variable created to determine the real "finalYear"
		final int START_YEAR = 2015;
		final int FACTOR = 5;
		final int END_YEAR = 30; // This variable is added to START_YEAR of the year entered by the user

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter start year multiple of 5 or hit ENTER: ");
	    
		// In order to "read" an single ENTER key, I'm reading the input as an String.
		String readString = in.nextLine();
		
		// If readString is empty, it means the user had pressed the ENTER key without any value
		if (readString.isEmpty()) {
			year = START_YEAR;
		} else {
			year = Integer.parseInt(readString); // Parsing the input string into an int variable
		} 

		finalYear = year + END_YEAR;
		
		while (year <= finalYear) {
			System.out.println("Year " + year);
			year += FACTOR;

		}

		in.close();

	}

}

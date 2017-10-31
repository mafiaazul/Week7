import java.util.Scanner;

public class YearIncreaseRocha {

	public static void main(String[] args) {

		int year = 0;
		final int START_YEAR = 2015;
		final int FACTOR = 5;
		final int END_YEAR = 30;
		int loopControl = END_YEAR/FACTOR;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter start year multiple of 5 or hit ENTER: ");
		year = in.nextInt();
			
		if (year == 0)
			year = START_YEAR;
		
		while (year < END_YEAR) {
			System.out.println("Year " + year);
			year += FACTOR;
			loopControl--;
		}
		
		in.close();
		
	}

}

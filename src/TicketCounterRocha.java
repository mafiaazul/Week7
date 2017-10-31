import java.util.Scanner;

public class TicketCounterRocha {

	public static void main(String[] args) {

		final int MAX_TICKETS_PER_BUYER = 6;
		final int NO_TICKETS_LEFT = 0;
		int remainingTickets = 75;
		int numberOfBuyers = 0;
		int desiredNumberOfTickets = 0;

		Scanner in = new Scanner(System.in);

		while (remainingTickets > NO_TICKETS_LEFT) {

			System.out.println("Please enter desired number of tickets: ");
			if (in.hasNextInt()) {
				desiredNumberOfTickets = in.nextInt();
				in.nextLine();
				if ((desiredNumberOfTickets > MAX_TICKETS_PER_BUYER) || (desiredNumberOfTickets <= 0)) {
					System.out.println("Number of tickets must be between 1 and 6");
				} else if (desiredNumberOfTickets <= remainingTickets) {
					System.out.println("You bought " + desiredNumberOfTickets);
					remainingTickets -= desiredNumberOfTickets;
					numberOfBuyers++;
					System.out.println("Remaining tickets " + remainingTickets);
				} else
					System.out.println("We only have " + remainingTickets + " ticket(s) available");
			} else {
				in.nextLine();
			}
		}

		System.out.println("Number of buyers " + numberOfBuyers);
		in.close();
	}

}

import java.text.DecimalFormat;
import java.util.Scanner;

public class BookOrderRocha {
	public static void main(String[] args) {

		double bookCost = 0;
		double subtotal = 0;
		int numberOfBooks = 0;
		
		final double TAX_RATE = 0.065;
		final double SHIPPING_CHARGE = 2.95;
		final int ZERO_BOOKS = 0;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter number of books purchased: ");
		while (!in.hasNextInt()) {
			System.out.print("You didn't enter a valid integer number.\nPlease enter an integer number for the books purchased:  ");
			in.nextLine();
		}
		
		numberOfBooks = in.nextInt();

		for (int counter = numberOfBooks; counter > ZERO_BOOKS; counter--) {
			System.out.print("Enter the book's #" + counter + " cost: ");
			bookCost = in.nextDouble();
			subtotal += bookCost;
		}

		double tax = subtotal * TAX_RATE;
		double shippingTotal = numberOfBooks * SHIPPING_CHARGE;
		double total = subtotal + tax + shippingTotal;

		DecimalFormat df = new DecimalFormat("$0.00");

		System.out.println("Number of books purchased: " + numberOfBooks);
		System.out.println("Book Subtotal: " + df.format(subtotal));
		System.out.println("Tax: " + df.format(tax));
		System.out.println("Shipping: " + df.format(shippingTotal));
		System.out.println("----------------------------------");
		System.out.printf("Order Total: $%.2f", total);

		in.close();
	}
}

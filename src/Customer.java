
import java.lang.*;
import java.util.*;

class Customer {
	private String _name;
	private ArrayList<Rental> _rentals = new ArrayList<Rental>();
	private int frequentRenterPoints;
	private double totalAmount;
	private String result;
	private double totalCharge;
	private int totalFrequentRenterPoints;

	public Customer(String newname) {
		_name = newname;
	};

	public void addRental(Rental arg) {
		_rentals.add(arg);
	};

	public String getName() {
		return _name;
	};

	public String statement() {
		totalAmount = 0;
		frequentRenterPoints = 0;

		result = "Rental Record for " + this.getName() + "\n";
		result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
		

_rentals.forEach(rental -> {
	
			frequentRenterPoints += rental.getFrequentRenterPoints();

			// show figures for this rental
			result += "\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t"
					+ String.valueOf(rental.getCharge()) + "\n";
			totalAmount += rental.getCharge();
		});
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		totalCharge = 0;
		_rentals.forEach(rental -> {
			totalCharge += rental.getCharge();
		});
		return totalCharge;
	}

	private int getTotalFrequentRenterPoints() {
		totalFrequentRenterPoints = 0;
		_rentals.forEach(rental -> {
			totalFrequentRenterPoints += rental.getFrequentRenterPoints();
		});
		return totalFrequentRenterPoints;
	}

}

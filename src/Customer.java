
import java.util.ArrayList;

class Customer {
	private String name;
	private ArrayList<Rental> rentalList = new ArrayList<Rental>();
	private int frequentRenterPoints;
	private double totalAmount;
	private String rentalStatement;
	private double totalCharge;
	private int totalFrequentRenterPoints;

	public Customer(String name) {
		this.name = name;
	};

	public void addRental(Rental rental) {
		rentalList.add(rental);
	};

	public String getName() {
		return name;
	};

	public String statement() {
		
		totalAmount = 0;
		frequentRenterPoints = 0;

		rentalStatement = "Rental Record for " + this.getName() + "\n";
		rentalStatement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

		rentalList.forEach(rental -> {

			frequentRenterPoints += rental.getFrequentRenterPoints();

			rentalStatement += "\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t"
					+ String.valueOf(rental.getCharge()) + "\n";
			
			totalAmount += rental.getCharge();
		});
		
		rentalStatement += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		rentalStatement += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		
		return rentalStatement;
	}

	private double getTotalCharge() {
		
		totalCharge = 0;
		
		rentalList.forEach(rental -> {
			
			totalCharge += rental.getCharge();
			
		});
		
		return totalCharge;
	}

	private int getTotalFrequentRenterPoints() {
		
		totalFrequentRenterPoints = 0;
		
		rentalList.forEach(rental -> {
			
			totalFrequentRenterPoints += rental.getFrequentRenterPoints();
			
		});
		
		return totalFrequentRenterPoints;
	}

}

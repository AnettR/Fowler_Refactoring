import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	
	Customer anne = new Customer("Anne");
	Movie titanic = new Movie("Titanic", PriceCodes.NEW_RELEASE);
	Rental costs = new Rental(titanic, 5);
	

	@Test
	public void testStatement() {
		anne.addRental(costs);
		
		String resultString = "Rental Record for Anne\n";
		resultString += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
		resultString += "\tTitanic\t\t5\t15.0\n";
		resultString += "Amount owed is 15.0\n";
		resultString += "You earned 2 frequent renter points";
		
		// Checks that String and return-value of 'statement' method are equal
	    assertEquals(resultString, anne.statement());
		
	}

}
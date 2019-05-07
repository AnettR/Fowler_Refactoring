import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	
	Customer anne = new Customer("Anne");
	Movie titanic = new Movie("Titanic", PriceCodes.NEW_RELEASE);
	Rental costs_anne = new Rental(titanic, 5);
	
	Customer thorsten = new Customer("Thorsten");
	Movie jurassicPark = new Movie("Jurassic Park", PriceCodes.REGULAR);
	Rental costs_thorsten = new Rental(jurassicPark, 2);
	
	
	Customer jane = new Customer("Jane");
	Movie mulan = new Movie("Mulan", PriceCodes.CHILDRENS);
	Rental costs_jane = new Rental(mulan, 9);
	
	

	@Test
	public void testStatement() {
		
		// Test for Anne
		anne.addRental(costs_anne);
		
		String resultString_anne = "Rental Record for Anne\n";
		resultString_anne += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
		resultString_anne += "\tTitanic\t\t5\t15.0\n";
		resultString_anne += "Amount owed is 15.0\n";
		resultString_anne += "You earned 2 frequent renter points";
		
		// Checks that String and return-value of 'statement' method are equal
	    assertEquals(resultString_anne, anne.statement());
	    
	    
	    // Test for Thorsten
		thorsten.addRental(costs_thorsten);
		
		String resultString_thorsten = "Rental Record for Thorsten\n";
		resultString_thorsten += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
		resultString_thorsten += "\tJurassic Park\t\t2\t2.0\n";
		resultString_thorsten += "Amount owed is 2.0\n";
		resultString_thorsten += "You earned 1 frequent renter points";
		
		// Checks that String and return-value of 'statement' method are equal
	    assertEquals(resultString_thorsten, thorsten.statement());
	    
	    
	    // Test for Jane
		jane.addRental(costs_jane);
		
		String resultString_jane = "Rental Record for Jane\n";
		resultString_jane += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
		resultString_jane += "\tMulan\t\t9\t10.5\n";
		resultString_jane += "Amount owed is 10.5\n";
		resultString_jane += "You earned 1 frequent renter points";
		
		// Checks that String and return-value of 'statement' method are equal
	    assertEquals(resultString_jane, jane.statement());
		
	}

}
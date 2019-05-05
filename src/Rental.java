class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public double getCharge() {
		
		double result = 0;
		
		switch (getMovie().getPriceCode()) {
		case REGULAR:
			result += 2;
			if (getDaysRented() > 2)
				result += (getDaysRented() - 2) * 1.5;
			break;
		case NEW_RELEASE:
			result += getDaysRented() * 3;
			break;
		case CHILDRENS:
			result += 1.5;
			if (getDaysRented() > 3)
				result += (getDaysRented() - 3) * 1.5;
			break;
		}
		
		return result;
		
	}

	int getFrequentRenterPoints() {
		
		if ((getMovie().getPriceCode() == PriceCodes.NEW_RELEASE) && getDaysRented() > 1)
			return 2;
		else
			return 1;
	}

}
public class Movie {
	private String title;
	private PriceCodes priceCode;

	public Movie(String title, PriceCodes priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public PriceCodes getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(PriceCodes newPriceCode) {
		priceCode = newPriceCode;
	}

	public String getTitle() {
		return title;
	};
}
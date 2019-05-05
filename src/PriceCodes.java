
public enum PriceCodes {
	

	REGULAR(0),
	NEW_RELEASE(1),
	CHILDRENS(2);

	private int priceCode;
	
	private PriceCodes(int priceCode) {
		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}
}

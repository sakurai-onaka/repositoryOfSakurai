package day05.q01;

public class CashRegister {
	public int calcPrice(int priceBeforeTax) {
		int priceAfterTax = (int)(priceBeforeTax * 1.1);
		return priceAfterTax;
	}
}

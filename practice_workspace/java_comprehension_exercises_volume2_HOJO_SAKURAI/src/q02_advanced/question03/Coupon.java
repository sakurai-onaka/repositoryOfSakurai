package q02_advanced.question03;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	/**
	 * 2
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 3
	 */
	public Coupon() {

	}

	/**
	 * 4
	 */
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	/**
	 * 5
	 */
	@Override
	public String toString() {
		return "Coupon [id=" + this.id + ", discountRate=" + this.discountRate + ", description=" + this.description
				+ "]";
	}

	/*
	 * 6
	 */
	public static Coupon getInstance(int id, double discountRate, String description) {
		Coupon coupon = new Coupon(id, discountRate, description);
		return coupon;
	}
}
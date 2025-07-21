package question03;

public class SystemMain03 {

	public static void main(String[] args) {
		/*
		 * (1)
		 */
		int price = 30;
		int tatalPrice = 300;
		int quantity = tatalPrice / price;
		System.out.println("商品の購入数は" + quantity + "個です。");
		/*
		 * (2)
		 */
		int newPrice = price + 100;
		int changeQuantity = --quantity;
		newPrice += price;
		int totalPrice = newPrice * quantity;
		System.out.println("商品の購入数は" + changeQuantity + "個です。");
		System.out.println("商品の新しい値段は" + newPrice + "円に変更です。");
		System.out.println("商品の購入合計金額は" + totalPrice + "円です。");
		/*
		 * (3)
		 */
		double priceIncreaseRate = 1.1;
		int changePrice = (int)(newPrice * priceIncreaseRate);
		System.out.println("商品の元の値段は" + newPrice + "円です。");
		System.out.println("商品の値上げ後の値段は" + changePrice + "円です。");
	}

}

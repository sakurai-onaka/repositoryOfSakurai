package day07.q01;

public class Drink {
	private int price;
	private String name;
	public Drink() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.price = 120;
		this.name = "ビタミン麦茶";
	}
	public Drink(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public void show() {
		System.out.println(name + ":" + price + "円です。");
	}
}

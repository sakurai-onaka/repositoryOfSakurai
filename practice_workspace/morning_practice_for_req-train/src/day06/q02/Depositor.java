package day06.q02;

public class Depositor {
	private String name;
	private int money;
	
	public void showData() {
		System.out.println(name);
		System.out.println(money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

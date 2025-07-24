package day08.q02;

public class Monster {
	private String name;
	private int hp;
	
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
		toString();
		
	}
	
	public String toString() {
		System.out.println(this.name + "が現れた！！");
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}

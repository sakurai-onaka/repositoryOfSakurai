package day08.q01;

import day08.q02.Monster;

public class Magic {
	private String name;

	// 問題解答
	public Magic(String name) {
		this.name = name;
	}

	public void attack(int mp,Monster monster) {
		System.out.println("\n" + name + "の攻撃！！");
		int damege = (int) (Math.random() * mp) + 10;
		System.out.println(monster.getName() + "に" + damege + "のダメージ！！");
		monster.setHp(monster.getHp() - damege);
	}
}

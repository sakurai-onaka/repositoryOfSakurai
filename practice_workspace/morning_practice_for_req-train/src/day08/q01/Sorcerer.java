package day08.q01;

import day08.q02.Monster;

public class Sorcerer extends Magic {

	public Sorcerer(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void attack(int mp, Monster monster) {
		super.attack(mp, monster);
		mp = (int) (mp * 0.5);
		System.out.println("追加で" + mp + "のダメージ!!");
		
		monster.setHp(monster.getHp() - mp);
	}
}

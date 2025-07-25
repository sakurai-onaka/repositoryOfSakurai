package question19;

import java.util.ArrayList;
import java.util.List;

public class Question19_02 {
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();

		list.add(new User());
		list.add(new User());
		list.add(new User());

		list.get(0).setName("鈴木太郎");
		list.get(1).setName("渡辺花子");
		list.get(2).setName("田中次郎");

		list.get(0).setAge(23);
		list.get(1).setAge(25);
		list.get(2).setAge(27);

		System.out.println("氏名は" + list.get(0).getName() + "、年齢は" + list.get(0).getAge() + "歳です。");
		System.out.println("氏名は" + list.get(1).getName() + "、年齢は" + list.get(1).getAge() + "歳です。");
		System.out.println("氏名は" + list.get(2).getName() + "、年齢は" + list.get(2).getAge() + "歳です。");
	}
}
package day07.q02;

public class MemberManager {
	private MemberManager() {

	}
	public static void show(Member[] list){
		 System.out.println("メンバー一覧を表示します");
		 for(Member m: list) {
			 m.show();
		 }
	}
	public static void update(Member[] list ,int id ,String name) {
		System.out.println("ID：" + id + "のメンバー名を" + name + "に更新します");
		for(Member m :list) {
			if(m.getId() == id) {
				m.setName(name);
			}
		}
	}
}

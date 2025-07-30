package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する
	String name;
	int age;
	int rank;
	
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("rank:" + this.rank);
		System.out.println("*****************");
	}
}

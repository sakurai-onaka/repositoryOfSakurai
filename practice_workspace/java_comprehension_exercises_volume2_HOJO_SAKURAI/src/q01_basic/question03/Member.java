package q01_basic.question03;

class Member {
	/*
	 * 1
	 */
	private String name;
	private int age;
	private int rank;

	/*
	 * 2
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	/*
	 * 3
	 */
	public Member() {

	}

	/*
	 * 4
	 */
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/*
	 * 5
	 */
	public void showMember() {
		if (this.name == null && this.age ==0 && this.rank == 0) {
			System.out.println("***MEMBER DATA***");
			System.out.println("name:null");
			System.out.println("age:0");
			System.out.println("rank:0");
			System.out.println("*****************");
		} else {
			System.out.println("***MEMBER DATA***");
			System.out.println("name:" + this.name);
			System.out.println("age:" + this.age);
			System.out.println("rank:" + this.rank);
			System.out.println("*****************");
		}
	}
}

package q01_basic.question02;

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
	public void rankUp() {
		this.rank += 1;
	}

	/*
	 * 4
	 */
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("rank:" + this.rank);
		System.out.println("*****************");
	}
}

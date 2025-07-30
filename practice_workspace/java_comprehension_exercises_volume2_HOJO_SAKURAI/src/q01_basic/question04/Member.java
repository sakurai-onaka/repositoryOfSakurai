package q01_basic.question04;

class Member {
	/*
	 * 1
	 */
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;

	/*
	 * 2
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/*
	 * 5
	 */
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + this.id);
		System.out.println("password:" + this.password);
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("rank:" + this.rank);
		System.out.println("*****************");
	}
}

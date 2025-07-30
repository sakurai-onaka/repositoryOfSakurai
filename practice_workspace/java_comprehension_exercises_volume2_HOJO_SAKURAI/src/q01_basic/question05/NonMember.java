package q01_basic.question05;

public class NonMember extends AbstMember {
	/*
	 * 7
	 */
	public NonMember(String name) {
		super.name = name;
	}

	/*
	 * 8
	 */
	public void buyItem() {
		System.out.println(super.name + " purchased the item at a fixed price");
	}

	/*
	 * 9	
	 */
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(super.name + "is a non-member");
		System.out.println("*****************");
	}
}

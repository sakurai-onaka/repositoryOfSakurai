package question12;

public class Question12_02 {
	static int num;

	private static void test() {
		num++;
		System.out.println(num);
	}

	public static void main(String[] args) {
		Question12_02.test();
		Question12_02.test();
	}

}

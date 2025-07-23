package question10;

public class Question10_1 {
	public static void main(String[] args) {
		Profile pf = new Profile();

		pf.setName("マイケル");
		pf.setAge(20);
		
		System.out.println("私の名前は" + pf.getName() + "です");
		System.out.println("年齢は" + pf.getAge() + "です");
	}
}
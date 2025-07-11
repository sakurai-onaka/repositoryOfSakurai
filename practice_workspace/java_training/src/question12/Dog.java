package question12;

public class Dog {
	String name;
	public void showName(){
		System.out.println("名前は"+name+"です");
	}
	
	public void showAge(int age) {
		System.out.println("年齢は"+age+"歳です");
	}
	
	public void showProfile(int age,String likeFood) {
		System.out.println("年齢は"+age+"歳、好きな食べ物は"+likeFood+"です");
	}
}

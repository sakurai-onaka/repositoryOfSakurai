package question01;

public class SystemMain01 {

	public static void main(String[] args) {
		
		/*
		 * (1)の問題
		 */
		int applePrice = 100;
		String stationery = "鉛筆";
		
		/*
		 * (2)の問題
		 */
		applePrice = 200;
		stationery = "消しゴム";
		
		/*
		 * (3)の問題
		 */
		int bananaPrice = applePrice;
		String writingUtensils = stationery;
		
		/*
		 * (4)の問題
		 */
		System.out.println("りんごの値段は"+ applePrice +"円です。");
		System.out.println("バナナの値段は"+ bananaPrice +"円です。");
		System.out.println("この筆記用具は"+ writingUtensils +"です。");
	}

}

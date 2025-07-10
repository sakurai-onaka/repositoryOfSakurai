package question09;

import java.util.Random;

public class Question09_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int result = new Random().nextInt(4) + 1; 
		 System.out.println("福引きを購入します"); 
		 
		 switch (result) {
		 case 1:
			 System.out.println("大当たり"); 
		 case 2:
			 System.out.println("当たり"); 
		 case 3:
			 System.out.println("外れ"); 
		 case 4:
			 System.out.println("大外れ"); 
		 } 
	}

}

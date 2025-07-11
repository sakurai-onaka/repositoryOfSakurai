package question16;

public class Question16_01 {
	Question16_01() { 
		System.out.println("コンストラクタです"); 
	} 
	
	Question16_01(int num){
		System.out.println("コンストラクタ"+num);
	}
	
	Question16_01(int num2,int num3){
		System.out.println("引数を変更すればコンストラクタを複数定義できる");
	}
}

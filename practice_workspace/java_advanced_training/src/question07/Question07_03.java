package question07;

import java.util.Arrays;

public class Question07_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] num = {30, 53, 21, 70, 60}; 
		Arrays.sort(num);
		System.out.println("ソートが完了しました");
		
		for(int value: num) {
			System.out.print(value+" ");
		}
	}

}

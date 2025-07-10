package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_03 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(input.readLine());
		if(num >= 80) {
			System.out.println("テストの点数は優秀です");
			System.out.println("お疲れさまでした");
		}else if(num < 80 || num >= 50) {
			System.out.println("テストの点数は平均的です");
			System.out.println("お疲れさまでした");
		}else if(num < 50 || num >= 30) {
			System.out.println("テストの点数が及第です");
			System.out.println("お疲れさまでした");
		}else {
			System.out.println("赤点のため追試が必要です");
			System.out.println("お疲れさまでした");
		}
	
	}

}

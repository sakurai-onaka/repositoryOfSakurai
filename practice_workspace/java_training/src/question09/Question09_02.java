package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_02 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(input.readLine());
		
		if(num >= 30) {
			System.out.println("numberの値は30以上です");
			System.out.println("処理を終了します");
		}else {
			System.out.println("numberの値は30未満です");
			System.out.println("処理を終了します");
		}
	}

}

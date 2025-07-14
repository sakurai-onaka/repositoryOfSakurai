package question06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question06_01 {

	public static void main(String[] args)throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1 を入力してください");
		String str1 = br.readLine();
		int num = Integer.parseInt(str1);
		
		String str = (num == 1) ? "1が入力されました。":"1 以外が入力されました";
		
		System.out.println(str);
	}

}

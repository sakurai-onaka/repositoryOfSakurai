package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_02 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		if(num <= 0) {
			System.out.println("範囲外の数値です。");
			System.exit(0);
		}
		
		if(num % 10 ==0) {
			System.out.println(num+"は10の倍数です。");
		}else {
			System.out.println(num+"は10 の倍数ではありません。");
		}
	}

}

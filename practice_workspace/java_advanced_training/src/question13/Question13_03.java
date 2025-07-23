package question13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question13_03 {

	public static void main(String[] args)throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		System.out.println(inputString);
		System.out.println("ゲコという文字は先頭から " + (inputString.indexOf("ゲコ") + 1) + "番目です");
	}

}

package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_07 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   

		System.out.println("1 以上の数値を入力してください"); 
		String str = br.readLine(); 
		int num = Integer.parseInt(str); 

		boolean errFlag = false; 
		if (num < 1) { 
			errFlag = true; 
		} 
		if (errFlag != true) { 
			System.out.println("正常な入力です"); 
		} 
	}

}

package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_01 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double size = Double.parseDouble(br.readLine());
		
		System.out.println("サイズが"+size+"の靴を購入します");
	}

}

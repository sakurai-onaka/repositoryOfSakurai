package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_01 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double dPrice = Double.parseDouble(br.readLine());
		int price = (int)(dPrice * 0.7);
		
		System.out.println("3割引で"+price+"です");
	}

}

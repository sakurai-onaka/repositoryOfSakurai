//追加問題

//パッケージ名 day02
//クラス名 Lesson3.java

//3つの任意の整数をコンソールから入力し、税込み金額（消費税は8％計算）の合計を出しなさい。
//また、平均金額を求めなさい。
//キャストしてすべて整数値で求めること。
//【出力例】
//金額①を入力してください>>210
//金額②を入力してください>>300
//金額③を入力してください>>350
//①から③の合計は税込み928円
//①から③の平均は税込み309円

package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3 {

	public static void main(String[] args) throws IOException {

		int sum = 0;// 合計金額
		int average = 0;// 平均金額
		int inputCount = 0;//入力した回数
		/*ここから記入*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("金額①を入力してください>>");
		String num1 = br.readLine();
		inputCount++;
		
		System.out.print("金額②を入力してください>>");
		String num2 = br.readLine();
		inputCount++;
		
		System.out.print("金額③を入力してください>>");
		String num3 = br.readLine();
		inputCount++;
		
		sum += Integer.parseInt(num1);
		sum += Integer.parseInt(num2);
		sum += Integer.parseInt(num3);
		sum = (int)(sum + (sum * 0.08));
		
		average = sum / inputCount;
		
		System.out.println("①から③の合計は税込み"+ sum +"円");
		System.out.println("①から③の平均は"+average+"円");
		
	}

}

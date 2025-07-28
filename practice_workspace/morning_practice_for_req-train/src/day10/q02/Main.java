//問題
//ArrayListに1～任意の整数値（コンソール入力）までの値を代入し表示する
//また、1～入力値までの合計を求めなさい。
//※入力値に整数以外が含まれていた場合、NumberFormatExceptionをキャッチし例外処理を行うこと
//【出力例】
//1から任意の値までの合計を求めます
//input num? >>13
//1から13までの合計は91
//listの要素を表示します
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13

package day10.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*ここから記入*/
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1から任意の値までの合計を求めます");
			System.out.print("input num?");
			String str = br.readLine();
			int inputNum = Integer.parseInt(str);
			List<Integer> list = new ArrayList<>();
			int sum = 0;
			
			for(int i=1; i<=inputNum; i++) {
				list.add(i);
			}
			
			for(int i: list) {
				sum += i;
			}
			
			System.out.println("1から13までの合計は" + sum);
			System.out.println("listの要素を表示します");
			
			for(int i: list) {
				System.out.println(i);
			}
		}catch(NumberFormatException | IOException e) {
			e.printStackTrace();
			System.out.println("不正な入力値");
		}
	}

}

/*問題

パッケージ名 day02
クラス名 Lesson2.java

標準入力機能（BufferedReader）を用いて以下の出力をしなさい

【出力例】
name? >>鈴木一郎
私の名前は鈴木一郎です。
*/
package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2 {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("name?>>");
		String name = rd.readLine();
		
		System.out.println("私の名前は"+name+"です");
	}
}

package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain02 {

	public static void main(String[] args)throws IOException{
		/*
		 * (1)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("名前を入力してください");
		String name = br.readLine();
		System.out.println("あなたの名前は"+ name +"です。");
		/*
		 * (2)
		 */
		System.out.println("年齢を入力してください");
		String temporaryAge = br.readLine();
		int age = Integer.parseInt(temporaryAge);
		System.out.println("あなたの年齢は"+ age +"歳です。");
		/*
		 * (3)
		 */
		System.out.println("好きな食べ物と飲み物を入力してください");
		String food = br.readLine();
		String drink = br.readLine();
		System.out.println("あなたの好きな食べ物は" + food + "です。");
		System.out.println("あなたの好きな食べ物は" + drink + "です。");
	}

}

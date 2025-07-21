package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain06 {

	public static void main(String[] args)throws IOException{
		/*
		 * (1)
		 */
		for(int i = 1;i <= 4;i++) {
			System.out.println("繰り返します。");
		}
		System.out.println("繰り返しが終了しました。");
		/*
		 * (2)
		 */
		String[] studentName = {"かなこ","ゆうた","あい","はるひ","かずき"};
		for(String name: studentName) {
			System.out.println(name);
		}
		/*
		 * (3)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int amount =0;
		int price = 100;
		System.out.println("鉛筆を購入しますか？");
		System.out.println("はい：0、いいえ：1 >");
		int buyFlag = Integer.parseInt(br.readLine());
		
		while(buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の個数を 1 つ増やしますか？");
			System.out.println("はい：0、いいえ：1 >");
			buyFlag = Integer.parseInt(br.readLine());
			System.out.println("購入した鉛筆の個数は" + amount + "個です");
			System.out.println("従って、合計金額は" + (amount * price) + "円です。");
		}
		/*
		 * (4)
		 */
		int amountBooks = 0;
		int sellFlag =0;
		int bookPrice = 200;
		System.out.println("本を売却します。");
		do{
			amountBooks++;
			System.out.println("売却する本の冊数を 1 つ増やしますか？");
			System.out.println("はい：0、いいえ：1 >");
			sellFlag = Integer.parseInt(br.readLine());
		}while(sellFlag == 0);
		
		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("従って、合計金額は" + (amountBooks * bookPrice) + "円です。");
	}
}

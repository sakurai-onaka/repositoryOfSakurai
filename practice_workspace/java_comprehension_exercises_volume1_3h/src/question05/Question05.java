package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question05 {

	public static void main(String[] args)throws IOException{
		/*
		 * (1)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("年齢を入力してください。");
		int age = Integer.parseInt(br.readLine());
		
		if(age < 20) {
			System.out.println("20 歳未満なので、お酒の提供ができません。");
		}
		/*
		 * (2)
		 */
		int[] numberGroup1 = {3,5,7,9};
		
		if(numberGroup1[3] == 3) {
			System.out.println("配列 numberGroup1 で 4 番目の数値は 3 です。");
		}else if(numberGroup1[3] == 5) {
			System.out.println("配列 numberGroup1 で 4 番目の数値は 5 です。");
		}else if(numberGroup1[3] == 7) {
			System.out.println("配列 numberGroup1 で 4 番目の数値は 7 です。");
		}else {
			System.out.println("配列 numberGroup1 で 4 番目の数値は 3 と 5 と 7 以外の数値です。");
		}
		/*
		 * (3)
		 */
		System.out.println("曜日を日本語で入力してください。");
		String userDayInput = br.readLine();
		switch(userDayInput) {
			case "月曜日":
				System.out.println("Monday");
				break;
			case "火曜日":
				System.out.println("Tuesday");
				break;
			case "水曜日":
				System.out.println("Wednesday");
				break;
			case "木曜日":
				System.out.println("Thursday");
				break;
			case "金曜日":
				System.out.println("Friday");
				break;
			case "土曜日":
				System.out.println("Saturday");
				break;
			case "日曜日":
				System.out.println("Sunday");
				break;
		}
		/*
		 * (4)
		 */
		System.out.println("数学の試験結果の点数を入力してください。");
		int math = Integer.parseInt(br.readLine());
		System.out.println("科学の試験結果の点数を入力してください。");
		int science = Integer.parseInt(br.readLine());
		
		if(60 <= math && 60 <= science) {
			System.out.println("数学と科学共に合格です。");
		}else if(60 <= math || 60 <= science) {
			System.out.println("数学か科学のどちらかが合格です。");
		}else {
			System.out.println("どちらも不合格です。");
		}
	}

}

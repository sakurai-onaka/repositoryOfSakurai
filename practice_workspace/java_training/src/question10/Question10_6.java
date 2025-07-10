package question10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10_6 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   

		System.out.println("1以上100以下の数値を入力してください"); 
		String str = br.readLine(); 
		int num = Integer.parseInt(str); 
		if(num >100 || 1 > num) {
			System.out.println("正常な数値を入力してください");
			System.exit(0);
		}
		
		for(int i=1; i<=num; i++) {
			if(i % 15 ==0) {
				System.out.println("FizzBuzz");
			}else if(i % 5 ==0) {
				System.out.println("Buzz");
			}else if(i % 3 ==0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}
		}
	}

}

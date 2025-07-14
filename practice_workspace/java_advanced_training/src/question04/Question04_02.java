package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_02 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] goods = new double[3];
		int sum=0;
		int count=0;
		
		for(int i=0;i<3;i++) {
			goods[i] = 0.7*Double.parseDouble(br.readLine());
			sum += (int)goods[i];
			count++;
		}
		System.out.println("合計"+sum+"円");
		System.out.println("合計"+sum/count+"円");
	}
}

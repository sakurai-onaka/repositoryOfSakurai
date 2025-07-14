package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_02 {
	public static void main(String[] args)throws IOException {
		String str1;
		String str2;
		String str3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str1 = br.readLine();
		str2 = br.readLine();
		str3 = br.readLine();
		
		System.out.println(str1+str2+str3);
	}
}

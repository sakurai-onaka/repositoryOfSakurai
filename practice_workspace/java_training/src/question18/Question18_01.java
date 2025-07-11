package question18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question18_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		
		System.out.println(sdf.format(date));
	}
}

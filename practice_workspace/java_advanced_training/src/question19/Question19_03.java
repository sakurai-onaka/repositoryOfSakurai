package question19;

import java.util.HashMap;
import java.util.Map;

public class Question19_03 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("orange", 100);
		map.put("grape", 200);
		map.put("strawberry", 300);

		System.out.println("みかんの価格は" + map.get("orange") + "円です");
		System.out.println("ぶどうの価格は" + map.get("grape") + "円です");
		System.out.println("いちごの価格は" + map.get("strawberry") + "円です");
	}
}

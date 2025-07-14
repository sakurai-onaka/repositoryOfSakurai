package question05;

public class Question05_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] num = new int[2][3];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[1][0] = 40;
		num[1][1] = 50;
		num[1][2] = 60;
		
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.println((i+1)+"段目の"+(j+1)+"つ目の値は" + num[i][j]);
			}
		}
	}

}

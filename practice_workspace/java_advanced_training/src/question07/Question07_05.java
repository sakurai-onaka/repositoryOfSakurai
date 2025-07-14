package question07;

public class Question07_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<8;i++) {
			for(int k=0; k<7-i;k++) {
				System.out.print("　");
			}
			
			for(int j=0;j<15;j++) {
				if(2*i+1 ==j )break;
				
				if(i%2==0){
					System.out.print("■");
				}else {
					System.out.print("□");
				}
			}
			System.out.println("\n");
		}
	}

}

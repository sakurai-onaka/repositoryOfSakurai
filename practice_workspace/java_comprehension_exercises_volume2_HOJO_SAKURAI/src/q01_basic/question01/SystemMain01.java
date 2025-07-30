package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		/*
		 * 3.1
		 */
		Member member1 = new Member();
		Member member2 = new Member();

		/*
		 * 3.2
		 */
		member1.name = "Miura Manabu";
		member1.age = 24;
		member1.rank = 1;

		member2.name = "Sato Kensuke";
		member2.age = 36;
		member2.rank = 2;
		
		/*
		 * 3.3
		 */
		System.out.println("---SHOW DATA---");
		member1.showMember();
		member2.showMember();
	}

}

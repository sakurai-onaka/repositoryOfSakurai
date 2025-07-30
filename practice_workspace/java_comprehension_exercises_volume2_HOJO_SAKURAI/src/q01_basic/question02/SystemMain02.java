package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		/*
		 * 5.1
		 */
		Member mem1 = new Member();
		
		/*
		 * 5.2
		 */
		mem1.setName("Miura Manabu");
		mem1.setAge(30);
		mem1.setRank(1);
		/*
		 * 5.3
		 */
		System.out.println("---SHOW DATA---");
		mem1.showMember();
		/*
		 * 5.4
		 */
		mem1.rankUp();
		/*
		 * 5.5
		 */
		System.out.println(">>>RANK UP>>>");
		System.out.println("---GET RANK---");
		System.out.println("newRank:" + mem1.getRank());
	}
}

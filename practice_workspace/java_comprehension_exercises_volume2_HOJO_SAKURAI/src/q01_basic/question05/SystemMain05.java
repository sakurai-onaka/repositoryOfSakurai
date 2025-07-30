package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		/*
		 * 12.1
		 */
		members[0] = new NonMember("Sato Kensuke");

		/*
		 * 12.2
		 */
		members[1] = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		/*
		 * 12.3
		 */
		System.out.println("---SHOW MEMBERS--- ");
		MemberManager.showAllMembers(members);

		/*
		 * 12.4
		 */
		System.out.println("---BUY ITEM---");
		for (AbstMember aMem : members) {
			aMem.buyItem();
		}
	}

}

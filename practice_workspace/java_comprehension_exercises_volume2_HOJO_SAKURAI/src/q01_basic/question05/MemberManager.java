package q01_basic.question05;

public class MemberManager {
	/*
	 * 10
	 */
	private MemberManager() {
		
	}
	/*
	 * 11
	 */
	public static void showAllMembers(AbstMember[] members){
		for(AbstMember mem: members) {
			mem.showMember();
		}
	}
}

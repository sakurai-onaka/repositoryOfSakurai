package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	/*
	 * 6
	 */
	public static void showAllMembers(Member[] members) {
		for(Member mem: members) {
			mem.showMember();
		}
	}

}

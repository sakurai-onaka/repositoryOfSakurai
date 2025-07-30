package q02_advanced.question03;

import java.util.List;

import q02_advanced.question02.Member;

public class MemberManager {
	private MemberManager() {
	}

	/**
	 * 15
	 * @param members
	 */
	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	/**
	 * 16
	 */
	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		Member targetMem;
		boolean targetFlag = false;
		for (Member member : members) {
			if (member.getId() == targetId) {
				targetMem = member;
				targetMem.setPassword(newPassword);
				targetFlag = true;
			}
		}
		if(!targetFlag)
		System.out.println("該当者はいませんでした。");
	}
}

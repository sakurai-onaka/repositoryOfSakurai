package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		/**
		 * 19
		 */
		ConsoleReader cr = new ConsoleReader();
		List<Member> members = new ArrayList<>();
		members.add(Member.getInstance(1, "pass", "miu", 28, 2));
		members.add(Member.getInstance(2, "aaaa", "sato", 43, 1));

		MemberManager.showAllMembers(members);
		int inputNum;
		String inputStr;
		System.out.println("===パスワードを変更します===");
		try {
			System.out.print("input target id>>");
			inputNum = cr.inputNumber();
			System.out.print("input new password>>");
			inputStr = cr.inputString();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			return;
		}
		MemberManager.updatePassword(members,inputNum,inputStr);
		
		MemberManager.showAllMembers(members);
	}

}

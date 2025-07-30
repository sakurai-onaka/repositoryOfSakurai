package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws IOException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");

		/*
		 * 9.1.2.1
		 */
		try {
			/*
			 * 9.1.1
			 */
			System.out.print("id>>");
			inputId = cr.inputNumber();
			/*
			 * 9.1.2
			 */
			System.out.print("input password>>");
			inputPassword = cr.inputString();
		} catch (IOException | NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;
		}
		/*
		 * 9.2
		 */
		Member member = new Member(inputId, inputPassword, name, age, rank);
		/*
		 * 
		 */
		member.showMember();
	}

}

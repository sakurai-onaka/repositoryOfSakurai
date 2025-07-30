package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();
		MemberStorage ms = new MemberStorage();
		Member loginUser = null;
		int num = 0;
		String str = null;
		while (!isLogin) {
			try {
				num = cr.inputNumber();
				str = cr.inputString();
				loginUser = loginService.doLogin(num, str);
			} catch (NumberFormatException | IOException e) {
				System.out.println("変換失敗");
				e.printStackTrace();
			} catch(NullPointerException e) {
				System.out.println("ID またはパスワードが違っています。再度入力\n"
						+ "してください。");
			}
			System.out.println("ログインに成功しました");	
		}
		loginUser.showMember();
	}

}

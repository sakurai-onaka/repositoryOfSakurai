package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから処理を記述
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}
	
	public Member doLogin(int id, String password) {
		boolean hitFlag=false;
		for(Member member : this.memberStorage.getMembers()) {
			if(member.getId() == id && member.getPassword() == password) {
				return member;
			}
		}
		return null;
	}
}

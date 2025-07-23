package question14;

public class Inheritance {
	/** 趣味 */
	private String hobby;
	
	public Inheritance () {
		System.out.println("Inheritance クラスのコンストラクタが実行されました");
	}

	/** 
	* 趣味を設定 
	* 
	* @param hobby 趣味 
	*/
	void setHobby(String hobby) {
		this.hobby = hobby;
	}

	/** 
	* 趣味を取得 
	* 
	* @return 趣味
	*/
	String getHobby() {
		return hobby;
	}
}

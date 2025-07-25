package day09.q02;

public class Drums extends Instrument{

	private String maker;
	private String constitution;// ドラムの構成

	// Instrumentのコンストラクタを呼び出し
	public Drums(String maker) {
		this.maker = maker;
		this.constitution = "バスドラム・スネアドラム・タムタム・シンバルのセットです";
	}

	public void playMusic() {
		System.out.println(maker + "のドラムを演奏します。");
	}

	@Override
	public String toString() {
		return "Drums [constitution=" + constitution + ", maker=" + maker + "]";
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getConstitution() {
		return constitution;
	}

	public void setConstitution(String constitution) {
		this.constitution = constitution;
	}

}

package question17;

public class Show implements Preparation,Question17_pre{
	@Override
	public void show() {
		System.out.println("インターフェイス Preparation を実装しました");
	}
	
	@Override
	public void display() {
		System.out.println("インターフェイス Question15_pre を実装しました");
	}
}

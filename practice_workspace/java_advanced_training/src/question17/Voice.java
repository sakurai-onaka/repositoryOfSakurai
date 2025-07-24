package question17;

public class Voice implements Talk_1,Talk_2{
	@Override
	public void bark() {
		System.out.println("犬が吠えました");
	}
	
	@Override
	public void cry() {
		System.out.println("猫が鳴きました");
	}
}

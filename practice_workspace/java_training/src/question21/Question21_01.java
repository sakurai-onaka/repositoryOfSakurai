package question21;

public class Question21_01 extends Parent{
	@Override
	public void show(){
		System.out.println("オーバーライドした show()メソッドです");
	}
	
	public void show(String str){
		System.out.println("オーバーロード");
	}
}
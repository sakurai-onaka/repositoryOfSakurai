package question18;

public class TestException extends Exception{
	public TestException() {
		super("これでええんか");
	}
	public TestException(String msg) {
		super(msg);
	}
}

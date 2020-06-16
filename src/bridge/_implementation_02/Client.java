package bridge._implementation_02;

public class Client {

	static void callOperation(String context){
		new Abstraction().callOperation(context);
	}

	public static void main(String[] args) {

		callOperation("a");
	}
}
package bridge._implementation_01;

import bridge._implementation_02.Abstract;

import java.util.HashMap;

public class Abstraction implements Abstract {

	HashMap<String, Implementation> implementation = new HashMap<>();

	Abstraction() {
		implementation.put("a", new ImplementationA());
		implementation.put("b", new ImplementationB());
	}

	public void callOperation(String name){
		implementation.get(name).implementedOperation();
	}
}
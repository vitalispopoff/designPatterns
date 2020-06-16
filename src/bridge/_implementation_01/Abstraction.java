package bridge._implementation_01;

import java.util.HashMap;

public class Abstraction {

	HashMap<String, Implementation> implementation = new HashMap<>();

	Abstraction() {
		implementation.put("a", new ImplementationA());
		implementation.put("b", new ImplementationB());
	}

	void callOperation(String context){
		implementation.get(context).implementedOperation();
	}
}
package bridge._implementation_02;

import java.util.HashMap;

public class Abstraction implements Abstract {

	HashMap<String, Implementation> implementation = new HashMap<>();

	Abstraction() {
		implementation.put("a", new ImplementationA());
		implementation.put("b", new ImplementationB());
	}

	@Override
	public void callOperation(String name) {
		implementation.get(name).implementedOperation();
	}
}
package factories.factoryMethod.implementation_04;

public class ToyFactory {

	public Toy produceToy(SimpleFactory toyType) {
		return toyType.constructToy();
	}
}
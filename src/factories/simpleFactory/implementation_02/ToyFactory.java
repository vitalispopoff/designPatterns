package factories.simpleFactory.implementation_02;

public class ToyFactory {

	public Toy produceToy(ToyType toyType) {
		return toyType.constructToy();
	}
}
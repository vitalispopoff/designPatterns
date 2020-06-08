package factories.simpleFactory.implementation_03;

public class ToyFactory {

	public Toy produceToy(ToyType toyType) {
		return toyType.constructToy();
	}
}
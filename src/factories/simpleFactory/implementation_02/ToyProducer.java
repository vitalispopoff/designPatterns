package factories.simpleFactory.implementation_02;

public class ToyProducer {

	public Toy produceToy(ToyType toyType) {
		return toyType.constructToy();
	}
}
package factories.simpleFactory.implementation_03;

public class ToyProducer {

	public Toy produceToy(ToyType toyType) {
		return toyType.constructToy();
	}
}
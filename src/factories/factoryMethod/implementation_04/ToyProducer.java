package factories.factoryMethod.implementation_04;

public class ToyProducer {

	public Toy produceToy(Factory toyType) {
		return toyType.constructToy();
	}
}
package factories.simpleFactory.implementation_01;

public class ToyProducer {

	public Factory factory;

	public ToyProducer(Factory factory) {
		this.factory = factory;
	}

	public Toy produceToy(String toyName) {
		return factory.constructToy(toyName);
	}
	}
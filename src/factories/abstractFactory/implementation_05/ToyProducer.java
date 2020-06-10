package factories.abstractFactory.implementation_05;

import factories.abstractFactory.implementation_05.toys.Toy;

public class ToyProducer {

	public Toy produceToy(String toyName, ToyType toyType) {
		return Factory.constructToy(toyName, toyType);
	}
}
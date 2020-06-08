package factories.simpleFactory.implementation_02;

public class ToyFactory {

//	public SimpleFactory simpleFactory;

/*	public ToyFactory(SimpleFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
	}*/

	public Toy produceToy(ToyType toyType) {
		return toyType.constructToy();
	}
}
package factories.simpleFactory.implementation_01;

public class ToyFactory {

	public SimpleFactory simpleFactory;

	public ToyFactory(SimpleFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
	}

	public Toy produceToy(String toyName) {
		return simpleFactory.constructToy(toyName);
	}

	/*	public Toy produceToy(String toyName){
			if (toyName == "[Bb]all") return new ToyBall();
			else if (toyName == "[Dd]oll") return new ToyDoll();
			else return null;
		}*/        // before the simple factory - disposable
}
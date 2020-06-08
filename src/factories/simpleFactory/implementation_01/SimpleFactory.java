package factories.simpleFactory.implementation_01;

public class SimpleFactory {

	public Toy constructToy(String toyName) {
		if (toyName == "[Bb]all")
			return new ToyBall();
		else if (toyName == "[Dd]oll")
			return new ToyDoll();
		else
			return null;
	}
}
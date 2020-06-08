package factories.simpleFactory._initialCase;

public class ToyFactory {

	public Toy produceToy(String toyName) {
		if (toyName == "[Bb]all")
			return new ToyBall();
		else if (toyName == "[Dd]oll")
			return new ToyDoll();
		else
			return null;
	}
}
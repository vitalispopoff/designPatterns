package factories.simpleFactory.implementation_01;

public class Factory {

	public Toy constructToy(String toyName) {
		if (toyName.matches("[Bb]all"))
			return new ToyBall();
		else if (toyName.matches("[Dd]oll"))
			return new ToyDoll();
		else
			System.out.println("string "+toyName+" is not recognized");
			return null;
	}
}
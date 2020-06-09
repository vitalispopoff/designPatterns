package factories.abstractFactory.implementation_05;

import factories.abstractFactory.implementation_05.toys.*;

public class ToyBoyFactory implements Factory {

	@Override
	public Toy constructToyBall() {
		return new ToyBallsForBoys();
	}

	@Override
	public Toy constructToyDoll() {
		return new ToyDollsForBoys();
	}
}
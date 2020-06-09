package factories.abstractFactory.implementation_05;

import factories.abstractFactory.implementation_05.toys.*;

public class ToyGirlFactory implements Factory {


	@Override
	public Toy constructToyBall() {
		return new ToyBallsForGirls();
	}

	@Override
	public Toy constructToyDoll() {
		return new ToyDollsForGirls();
	}
}
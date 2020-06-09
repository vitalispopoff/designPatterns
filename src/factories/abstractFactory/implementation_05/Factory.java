package factories.abstractFactory.implementation_05;

import factories.abstractFactory.implementation_05.toys.Toy;

public interface Factory {

	Toy constructToyBall();

	Toy constructToyDoll();
}
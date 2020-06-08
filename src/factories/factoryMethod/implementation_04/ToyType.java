package factories.factoryMethod.implementation_04;

import factories.factoryMethod.implementation_04.toys.*;

public enum ToyType implements Factory {

	BALL {
		public Toy constructToy() {
			return new ToyBall();
		}


	},
	DOLL {
		public Toy constructToy() {
			return new ToyDoll();
		}
	},
}
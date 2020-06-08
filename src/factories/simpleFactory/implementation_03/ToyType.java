package factories.simpleFactory.implementation_03;

public enum ToyType implements Factory {

	BALL {
		public Toy constructToy() {
			return new ToyBall();
		}

		class ToyBall extends Toy {
			public ToyBall() {
				super("Ball", false);
			}
		}
	},
	DOLL {
		public Toy constructToy() {
			return new ToyDoll();
		}

		class ToyDoll extends Toy {
			public ToyDoll() {
				super("Doll", true);
			}
		}
	},
}
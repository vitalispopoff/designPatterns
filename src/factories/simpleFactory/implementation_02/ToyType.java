package factories.simpleFactory.implementation_02;

public enum ToyType implements Factory {

	BALL {
		@Override
		public Toy constructToy() {
			return new ToyBall();
		}
	},
	DOLL {
		@Override
		public Toy constructToy() {
			return new ToyDoll();
		}
	},
}
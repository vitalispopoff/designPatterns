//	@formatter:off

package factories.abstractFactory.implementation_05;

public enum ToyType {


	BOY	 { @Override public Factory getFactory() { return new ToyBoyFactory(); }},
	GIRL { @Override public Factory getFactory() { return new ToyGirlFactory(); }};

	public Factory getFactory() {return null;}
}

//	@formatter:on
package factories.factoryMethod.implementation_04;

public abstract class Toy {

	String toyName;
	boolean forGirls;

	public Toy(String toyName, boolean forGirls) {
		this.toyName = toyName;
		this.forGirls = forGirls;
	}
}
package factories.simpleFactory.implementation_03;

public abstract class Toy {

	String toyName;
	boolean forGirls;

	public Toy(String toyName, boolean forGirls) {
		this.toyName = toyName;
		this.forGirls = forGirls;
	}

	@Override
	public String toString() {
		return "Toy{" +
				"toyName='" + toyName + '\'' +
				", forGirls=" + forGirls +
				'}';
	}
}
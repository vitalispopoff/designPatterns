package factories._initialCase;

public abstract class Toy {

	public String toyName;
	public boolean forGirls;

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
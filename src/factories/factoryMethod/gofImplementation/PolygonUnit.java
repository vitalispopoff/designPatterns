package factories.factoryMethod.gofImplementation;

public abstract class PolygonUnit implements Polygon {

	String name;
	double
			perimeter,
			area;

	public abstract void setParameter(double parameter);

	public abstract double getArea();
	public abstract double getPerimeter();

	public void setName(String name) {this.name = name;}

	public String getName() {return name;}


}
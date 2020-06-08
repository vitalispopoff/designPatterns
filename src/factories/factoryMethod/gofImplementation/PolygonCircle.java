//	@formatter:off

package factories.factoryMethod.gofImplementation;

public class PolygonCircle extends PolygonUnit {

	double radius;

	public double getRadius() { return radius; }
	public void setRadius(double radius) { this.radius = radius; }

	@Override public void setParameter(double parameter){ setRadius(parameter); }

	@Override public double getArea() { return Math.pow(radius,2.) * Math.PI; }
	@Override public double getPerimeter() { return 2. * radius * Math.PI; }
}

//	@formatter:on
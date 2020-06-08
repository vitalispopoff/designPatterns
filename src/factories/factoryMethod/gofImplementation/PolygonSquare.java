//	@formatter:off

package factories.factoryMethod.gofImplementation;

public class PolygonSquare extends PolygonUnit {

	double edge;

	public double getEdge() { return edge; }
	public void setEdge(double edge) { this.edge = edge; }

	@Override public void setParameter(double parameter){ setEdge(parameter); }

	@Override public double getArea() { return Math.pow(edge,2.); }
	@Override public double getPerimeter() { return edge * 4.; }
}

//	@formatter:on
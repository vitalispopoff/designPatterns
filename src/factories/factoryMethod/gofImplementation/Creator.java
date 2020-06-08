package factories.factoryMethod.gofImplementation;

public class Creator {

	static PolygonContext context = PolygonContext.CIRCLE;

	public Polygon polygonFactoryMethod(){
		return context.instance();
	};
}
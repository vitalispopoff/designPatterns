package factories.factoryMethod.gofImplementation;

public enum PolygonContext implements CreatorInterface{
	CIRCLE{
		@Override public Polygon instance(){return new PolygonCircle();}
	},
	SQUARE {
		@Override public Polygon instance(){return new PolygonSquare();}
	}

}
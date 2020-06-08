package decorator;

public class EquationDecoratorMultiply extends EquationDecorator {

//	@formatter:off

	public EquationDecoratorMultiply(EquationComponent equationComponent){
		this.equationComponent = equationComponent;
	}
	public EquationDecoratorMultiply(EquationComponent equationComponent, Double value){
		this(equationComponent);
		setValue(value);
	}

	@Override public double getValue() { return value; }
	@Override public double evaluate() {
		return equationComponent.evaluate()*value;
	}

//	@formatter:on
}
package Decorator;

public class EquationDecoratorAdd extends EquationDecorator {

//	@formatter:off

	public EquationDecoratorAdd(EquationComponent equationComponent){ this.equationComponent = equationComponent; }
	public EquationDecoratorAdd(EquationComponent equationComponent, Double value){
		this(equationComponent);
		setValue(value);
	}

	@Override public double getValue() { return value; }
	@Override public double evaluate() { return equationComponent.evaluate()+value; }

//	@formatter:on
}
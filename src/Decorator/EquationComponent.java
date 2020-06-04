package Decorator;

public abstract class EquationComponent {

	Double value = Double.NaN;

	EquationComponent(){}
	EquationComponent(Double value){setValue(value);}

	public double getValue(){return value;}
	public void setValue(Double value){this.value = value;}

	public double evaluate(){return getValue();}
}
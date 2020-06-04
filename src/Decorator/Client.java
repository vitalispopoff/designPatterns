package Decorator;

public class Client {

	public static EquationComponent
			equation = new Equation();

	public static void main(String[] args) {

		equation = new EquationDecoratorAdd(equation, 1.);
		equation = new EquationDecoratorMultiply(equation, 10.);

		System.out.println(equation.evaluate());

	}
}
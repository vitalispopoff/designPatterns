package factories.abstractFactory.implementation_05;

import factories.abstractFactory.implementation_05.toys.Toy;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Factory[]
				factories = {
				ToyType.BOY.getFactory(),
				ToyType.GIRL.getFactory()
		};
		ArrayList<Toy>
				toysProduced = new ArrayList<>();

		for (Factory factory : factories) {
			toysProduced.add(factory.constructToyBall());
			toysProduced.add(factory.constructToyDoll());
		}

		System.out.println(toysProduced.size());

		for (Toy toy : toysProduced)
			System.out.println("toy no."
					+ toysProduced.indexOf(toy)
					+ ": "
					+ (toy == null ? "not a toy" : toy.toString())
			);    // temporarily disabled

	}
}
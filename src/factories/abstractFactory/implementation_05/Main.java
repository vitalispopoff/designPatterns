package factories.abstractFactory.implementation_05;

import factories.abstractFactory.implementation_05.toys.Toy;

import java.util.ArrayList;

public class Main {

	public static void testFactory() {
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
			);
	}

	public static void testProducer() {

		ToyProducer
				toyProducer = new ToyProducer();
		String[]
				toyRequest = {"Ball", "ball", "Doll", "doll", "roll"};
		ArrayList<Toy> toysProduced = new ArrayList<>();

		for (ToyType toyType : ToyType.values()) {
			for (String toy : toyRequest) toysProduced.add(toyProducer.produceToy(toy, toyType));
		}

		for (Toy toy : toysProduced)
			System.out.println(toy == null
					? "toy is null"
					: toy.toString()
			);
	}

	public static void main(String[] args) {

//		testFactory();
		testProducer();
	}
}
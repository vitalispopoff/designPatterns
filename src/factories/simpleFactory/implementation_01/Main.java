package factories.simpleFactory.implementation_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Factory
				factory = new Factory();
		ToyProducer
				client = new ToyProducer(factory);
		ArrayList<Toy>
				toysProduced = new ArrayList<>();
		String[]
				toysRequest = {"Ball", "ball", "Doll", "doll", "roll"};

		for (String toy : toysRequest) {
			toysProduced.add(client.produceToy(toy));
		}

		for (Toy toy : toysProduced)
			System.out.println("toy no."
					+ toysProduced.indexOf(toy)
					+ ": "
					+ (toy == null ? "not a toy" : toy.toString())
			);
	}
}
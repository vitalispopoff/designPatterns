package factories._initialCase;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ToyProducer
				client = new ToyProducer();
		ArrayList<Toy>
				toysProduced = new ArrayList<>();
		String[]
				toysToProduce = {"Ball", "ball", "Doll", "doll", "roll"};

		for (String toyRequest : toysToProduce) {
			toysProduced.add(client.produceToy(toyRequest));
		}

		for (Toy toy : toysProduced)
			System.out.println("toy no."
					+ toysProduced.indexOf(toy)
					+ ": "
					+ (toy == null ? "not a toy" : toy.toString())
			);
	}
}
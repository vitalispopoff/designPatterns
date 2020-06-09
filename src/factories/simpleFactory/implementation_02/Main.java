package factories.simpleFactory.implementation_02;

import java.util.ArrayList;

import static factories.simpleFactory.implementation_02.ToyType.*;

public class Main {

	public static void main(String[] args) {

		ToyProducer
				client = new ToyProducer();
		ArrayList<Toy>
				toysProduced = new ArrayList<>();
		ToyType[]
				toysToProduce = {BALL, DOLL};

		for (ToyType toyRequest : toysToProduce) {
			toysProduced.add(client.produceToy(toyRequest));
		}

		for(Toy toy : toysProduced)
			System.out.println("toy no."
			+ toysProduced.indexOf(toy)
			+ ": "
			+ toy.toString()
			);
	}
}
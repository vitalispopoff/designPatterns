package factories.abstractFactory.implementation_05;

import factories.abstractFactory.implementation_05.toys.Toy;


public interface Factory {

	static Toy constructToy(String toyName, ToyType toyType) {
//		if (toyName.matches("[Bb]all"))
		if (toyName.compareToIgnoreCase("ball")==0)
			return toyType.getFactory().constructToyBall();

//		else if (toyName.matches("[Dd]oll"))
		else if (toyName.compareToIgnoreCase("doll")==0)
			return toyType.getFactory().constructToyDoll();

		else
			System.out.println("string " + toyName + " is not recognized");
		return null;
	}

	Toy constructToyBall();

	Toy constructToyDoll();
}
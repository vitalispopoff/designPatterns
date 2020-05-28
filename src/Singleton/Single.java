package Singleton;

public class Single {

	static Single single;

	private Single(){}

	static public Single instanceOf(){
		if (single == null) single = new Single();
		return single;
	}
}
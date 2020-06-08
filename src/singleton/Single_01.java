package singleton;

public class Single_01 {
	private Single_01(){}


	public static Single_01 getInstance(){
		return SingletonHolder.instance;
	}


	private static class SingletonHolder{
		public static final Single_01 instance = new Single_01();
	}
}

/*
* https://www.baeldung.com/creational-design-patterns
* */
package rouff;

public class Singleton {
	private static Singleton singleInstance = null;

	private String s;

	private Singleton() {
		s = "Starting of singleton class";
	}

	public static synchronized Singleton getInstance() {
		if (singleInstance == null) {
			singleInstance = new Singleton();
		}
		return singleInstance;
	}
}

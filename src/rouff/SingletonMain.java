package rouff;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());
	}
}

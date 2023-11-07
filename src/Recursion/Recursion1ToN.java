package Recursion;

public class Recursion1ToN {

	public static void main(String[] args) {
		Recursion1ToN rec = new Recursion1ToN();
		rec.recursion(10);
	}
	
	 int count = 0;
	public  void recursion(int val) {
		System.out.println(count);
		count++;
		if(count > val) return;
		recursion(val);
	}
}

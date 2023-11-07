package Recursion;

public class Name5Times {
	public static void main(String[] args) {
		Name5Times name = new Name5Times();
		name.printNames("Sarvan",15);
	}
	int times = 0;
	public void printNames(String name,int count) {
		if(times == count)return ;
		System.out.println(name);
		times++;
		printNames(name,count);
	}
}

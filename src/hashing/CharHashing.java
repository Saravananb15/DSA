package hashing;

import java.util.Scanner;

public class CharHashing {
	public static void main(String[] args) {
		String s = "abcedfea";
		int hash[] = new int[255];
		for(int i=0;i<s.length();i++) {
			hash[s.charAt(i)]++;
		}
		Scanner sc= new Scanner(System.in);
		int q = sc.nextInt();
		
		for(int i=0;i<q;i++){
			int ch = sc.next().charAt(0);
			System.out.println(hash[ch]);
		}
		
	}
	
	
}

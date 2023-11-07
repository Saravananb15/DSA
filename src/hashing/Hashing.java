package hashing;

import java.util.Scanner;

public class Hashing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the array ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int hash[] = new int[13];
		for(int i=0;i<size;i++) {
			hash[arr[i]] +=1;
		}
		
		System.out.println("Number of operations : " );
		int operation = sc.nextInt();
		
		System.out.println("Enter the values to be found ");
		for(int i =0;i<operation;i++) {
			int val = sc.nextInt();
			System.out.println("the values of "+ val + " has been present "+hash[val]+" times");
		}
				
	}
}

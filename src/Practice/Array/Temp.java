package Practice.Array;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of days : ");
		int numbersOfDays = sc.nextInt();
		int temp[]  = new int[numbersOfDays];
		int sum = 0;
		for(int i=0;i<numbersOfDays;i++) {
			temp[i] = sc.nextInt();
			sum += temp[i];
		}
		
		double average = sum / numbersOfDays;
		System.out.println("Average temp "+ average);
		
		for(int i=0;i<numbersOfDays;i++) {
			if(temp[i]>average) {
				System.out.println("Above average : "+ temp[i]);
			}
		}
		
	}
}

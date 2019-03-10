//Write a program to print factorial of N ( without using any loop) 

import java.util.Scanner;
public class Prog1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
	public static int factorial(int n) {
		if(n==0) 
			return 1;
		else {
			int newFact = n*factorial(n-1);
			return newFact;
		}
	}
}
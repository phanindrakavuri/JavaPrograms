package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) throws NumberFormatException, IOException {
		System.out.println("Enter the number: ");
		// get input from the user
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		// call the recursive function to generate factorial
		int result = fact(a);
		System.out.println("Factorial of the number is: " + result);
		
		//using for loop
		int x=5;
		int fact = x;
		for(int i=(x-1);i>1;i--) {
			fact = fact*i;
		}
		System.out.println(fact);
		
		
	}

	
	//using recursion 
	static int fact(int b) {
		if (b <= 1)
			// if the number is 1 then return 1
			return 1;
		else
			// else call the same function with the value - 1
			return b * fact(b - 1);
	}
	
	
	
	
}
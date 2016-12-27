package classOne;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print the sum of two numbers without using + operator. Other operators have
		//to be used.
		//Create scanner object to get input from console
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number one: " );
		//get integer one from console
		int numb1 = scr.nextInt();
		System.out.println("Enter number two: " );
		//get integer two from console
		int numb2 = scr.nextInt();
		//sum of two numbers without + operator
		int sum = numb1-(-numb2);
		//Print sum of two integers 
		
		System.out.println("Sum of two numbers: " + sum);
		
		
		
	}

}

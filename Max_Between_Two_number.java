package lab;

import java.util.Scanner;

public class Max_Between_Two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=sc.nextInt();
		
		int max=(num1>num2)?num1:num2;
		System.out.println("The maximum number between "+num1+" and "+num2+" is: "+max);
		sc.close();
	}

}

package lab;

import java.util.Scanner;

public class BitCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println("Enter the bit position to check(0 for least significant bit)");
		int n=sc.nextInt();
		
		int mask=1<<n;
		boolean isBitSet=(mask&num)!=0;
		
		if(isBitSet) {
			System.out.println("The "+n+"th bit is "+num+" is set (1)");
		}
		else {
			System.out.println("The "+n+"th bit is "+num+" is set(0)");
		}
	}

}

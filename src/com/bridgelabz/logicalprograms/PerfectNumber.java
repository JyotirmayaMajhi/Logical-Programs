package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter any Number");
		n=sc.nextInt();
		
		isPerfectNumber(n);
		
		sc.close();
		

	}
	static void isPerfectNumber(int num1) {
		int num2=0;
		
		if(num1 > 0) {
			System.out.println("factor are");
			for(int i=1;i<num1;i++) {
				if(num1%i == 0) {
					System.out.print(i+"  ");
					num2 += 1;
				}
			}
			System.out.println();
		}
	}

}

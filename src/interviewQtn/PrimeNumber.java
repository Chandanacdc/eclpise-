package interviewQtn;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check prime or not");
		int n=sc.nextInt();
		boolean f=primeNumber(n);
		if(f==true) {
			System.out.println("Prime number");
		}
		else
			System.out.println("Not Prime number");
	}
	public static boolean primeNumber(int n) {
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
			}
		
		
	}
		return flag;
	}}

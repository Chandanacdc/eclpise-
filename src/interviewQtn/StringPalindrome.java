package interviewQtn;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		String str=sc.next();
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
			
		}
		System.out.println("Palindrome of string value is:"+str2);
		if(str.equals(str2)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("Not Palindrome");
		
	}

}

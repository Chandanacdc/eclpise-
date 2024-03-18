package interviewQtn;

import java.util.Scanner;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char a=sc.next().charAt(0);
		int count=occurance(str,a);
		System.out.println(a +" occures "+count+" times");
		
	}
	public static int occurance(String n,char a) {
		int p=0;
		for(int i=0;i<n.length();i++) {
		if(n.charAt(i)==a) {
			p++;
		}
		}
		return p;
		}
	}



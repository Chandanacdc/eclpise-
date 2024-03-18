package collection_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter list of array");
		for (int j=0;j<5;j++) {
			a1.add(sc.nextLine());
		}
		ArrayList<String> a2=new ArrayList<String>();
		System.out.println("Please enter string for adding element in array ");
		a2.add(sc.nextLine());
		String s1=a2.get(0);
		a1.add(2, s1);
		String s2=a1.get(2);
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		String s3= "";
		for(int i=s2.length()-1;i>=0;i--) {
			 s3=s3+s2.charAt(i);
		}
		System.out.println(s3);
		if(s3.equalsIgnoreCase(s2)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(s3+" is Not Palindrome");
		}
		
	}

}

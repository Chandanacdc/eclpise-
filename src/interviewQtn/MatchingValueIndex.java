package interviewQtn;

import java.util.ArrayList;

public class MatchingValueIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compare the index and match the value of array
		int a[]= {1,3,6,8,9};
		int b[]= {2,3,7,8,5};
		ArrayList<Integer>a1=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
			a1.add(a[i]);
			}
		}
		Object a2[]=a1.toArray();
		for(Object a3:a2) {
			System.out.print(a3+" ");
		}
	}

}
